package com.prush.e_dependency_inversion.bad.networking;

import com.prush.e_dependency_inversion.bad.models.RequestParams;

/**
 * This is a mock implementation of OkHttp having specific logic to make a network request.
 * It is a direct dependency of higher level module - BadApiRepository.
 */
@SuppressWarnings("unused")
public class OkHttpRequestBuilder {

    public interface OnHttpRequestCompletedListener {
        void onHttpRequestSuccess(Object responseObject);

        void onHttpRequestFailed(int errorCode);
    }

    public OkHttpRequestBuilder() {
    }

    public void makeGetRequest(RequestParams requestParams, OnHttpRequestCompletedListener listener) {

        // code to make http request using OkHttp apis.
        listener.onHttpRequestSuccess(null);
    }

    public void makePutRequest(RequestParams requestParams, OnHttpRequestCompletedListener listener) {

        // code to make http request using OkHttp apis.
        listener.onHttpRequestFailed(101);
    }

}
