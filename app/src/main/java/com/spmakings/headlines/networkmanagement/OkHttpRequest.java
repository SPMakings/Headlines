package com.spmakings.headlines.networkmanagement;

import android.os.AsyncTask;


import com.spmakings.headlines.models.NewsModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.LinkedList;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by Saikat Pakira on 9/21/2016.
 */
public class OkHttpRequest extends AsyncTask<Void, Void, Void> {

    private String URL = "", exception = "", result = "", resCode = "", GENER_IMAGE_URL = "";
    private OkHttpResponseListener callback = null;
    private OkHttpClient client = null;
    private final MediaType mediaType = MediaType.parse("application/json");
    private Response response = null;
    //=================data processing
    private LinkedList<NewsModel> mainData = null;

    public OkHttpRequest(final String URL, final String GENER_IMAGE_URL, OkHttpResponseListener callback) {
        this.URL = URL;
        this.GENER_IMAGE_URL = GENER_IMAGE_URL;
        this.callback = callback;
    }

    @Override
    protected Void doInBackground(Void... voids) {


        //Log.i("loadingIndex", URL);
        client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(URL)
                .get()
                .addHeader("cache-control", "no-cache")
                .build();

        try {
            response = client.newCall(request).execute();
            result = response.body().string();
            resCode = String.valueOf(response.code());
            //===========persing data

            JSONObject mainObj = new JSONObject(result);
            if (mainObj.getString("status").equals("ok")) {
                mainData = new LinkedList<NewsModel>();
                JSONArray mainArray = mainObj.getJSONArray("articles");
                for (int i = 0; i < mainArray.length(); i++) {
                    NewsModel temp_ = new NewsModel();
                    JSONObject innerObj_ = mainArray.getJSONObject(i);
                    temp_.setCreatedBy(innerObj_.getString("author"));
                    temp_.setCreatedDate(innerObj_.getString("publishedAt"));
                    temp_.setImageURL(innerObj_.getString("urlToImage"));
                    temp_.setMessage(innerObj_.getString("description"));
                    temp_.setTitle(innerObj_.getString("title"));
                    temp_.setSourceURL(innerObj_.getString("url"));
                    temp_.setChannelURL(GENER_IMAGE_URL);
                    mainData.add(temp_);
                }
            } else {
                exception = "API returns false.";
            }

        } catch (JSONException e) {
            e.printStackTrace();
            exception = e.toString();
        } catch (IOException e) {
            e.printStackTrace();
            exception = e.toString();
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);

        if (exception.equals("")) {
            callback.onSuccess(mainData);
        } else {
            callback.onError(resCode, exception);
        }

    }


}
