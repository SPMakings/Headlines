package com.spmakings.headlines;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

import com.spmakings.headlines.adapters.MainFeedsAdapters;
import com.spmakings.headlines.helper.DataManagement;
import com.spmakings.headlines.helper.onAdapterScrollListener;
import com.spmakings.headlines.models.NewsModel;
import com.spmakings.headlines.networkmanagement.OkHttpRequest;
import com.spmakings.headlines.networkmanagement.OkHttpResponseListener;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.LinkedList;

public class LandingActivity extends AppCompatActivity implements onAdapterScrollListener {


    private RecyclerView mainFeeds = null;
    private MainFeedsAdapters mainAdap = null;
    private View loader = null;
    private int loadingIndex = 0;
    private boolean loadingIsInProgress = false;
    private DataManagement dManager = null;
    private JSONArray finalGenerData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        dManager = new DataManagement();
        dManager.initAllData();
        finalGenerData = dManager.getAllData();
        //====================================
        mainFeeds = (RecyclerView) findViewById(R.id.main_feeds);
        loader = findViewById(R.id.progress);
        mainFeeds.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        mainFeeds.setHasFixedSize(false);
        //===================================
        mainAdap = new MainFeedsAdapters(LandingActivity.this, new LinkedList<NewsModel>());
        mainFeeds.setAdapter(mainAdap);
        mainAdap.addOnScrollListener(this);
        try {
            getNatGeoData(finalGenerData.getJSONObject(loadingIndex).getString("source_url"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        //=====================Drawer management.

        findViewById(R.id.drwer_category).setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(LandingActivity.this, CategorySelectionActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    private void getNatGeoData(final String URL_) throws JSONException {
        loader.setVisibility(View.VISIBLE);
        loadingIsInProgress = true;
        OkHttpRequest request = new OkHttpRequest(URL_, finalGenerData.getJSONObject(loadingIndex).getString("source_img_url"),
                new OkHttpResponseListener() {
                    @Override
                    public void onSuccess(final LinkedList<NewsModel> parsedData) {
                        Log.i("logMeIn", "Length of array : " + parsedData.size());
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                loader.setVisibility(View.GONE);
                                mainAdap.addMoreData(parsedData);
                                loadingIndex++;
                                loadingIsInProgress = false;
                            }
                        });
                    }

                    @Override
                    public void onError(String errorCode, String errorMessage) {
                        Log.i("logMeIn", "Error Code : " + errorCode + " message : " + errorMessage);
                    }
                });
        request.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
    }

    //==========Adapter Listener.

    @Override
    public void onScrollEnd() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                if (!loadingIsInProgress) {
                    Log.i("loadingIndex", "Loading Index : " + loadingIndex);
                    try {
                        getNatGeoData(finalGenerData.getJSONObject(loadingIndex).getString("source_url"));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }

    @Override
    public void onScrollStart() {
        //Auto generated method block. Add your code here.
    }


}
