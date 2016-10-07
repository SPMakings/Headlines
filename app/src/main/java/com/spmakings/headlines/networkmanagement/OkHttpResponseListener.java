package com.spmakings.headlines.networkmanagement;


import com.spmakings.headlines.models.NewsModel;


import java.util.LinkedList;

/**
 * Created by Saikat Pakira on 9/21/2016.
 */
public interface OkHttpResponseListener {
    void onSuccess(final LinkedList<NewsModel> parsedData);

    void onError(final String errorCode, String errorMessage);
}
