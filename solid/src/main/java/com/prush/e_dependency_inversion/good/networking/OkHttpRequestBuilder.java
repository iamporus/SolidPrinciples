package com.prush.e_dependency_inversion.good.networking;

import com.prush.e_dependency_inversion.good.models.RequestParams;

/**
 * Volley specific calling mechanism providing concrete implementation to the abstraction between Higher Level ApiRepository
 * and Lower Level networking utility
 * <p>
 * NOTE:
 * Though volley has its own interface based mechanism and doesn't work like this,
 * it's been used here just to give an example.
 */
public class OkHttpRequestBuilder implements IApiRequestBuilder {

    @Override
    public void makePostRequest(RequestParams request, OnHttpRequestCompletedListener listener) {
        // code to make http request using OkHttp apis.
        listener.onHttpRequestSuccess(null);
    }

    @Override
    public void makeGetRequest(RequestParams request, OnHttpRequestCompletedListener listener) {
        // code to make http request using OkHttp apis.
        listener.onHttpRequestFailed(101);
    }
}
