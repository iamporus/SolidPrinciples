package com.prush.e_dependency_inversion.good.networking;


import com.prush.e_dependency_inversion.good.models.RequestParams;

/**
 * Retrofit specific calling mechanism providing concrete implementation to the abstraction between Higher Level ApiRepository
 * and Lower Level networking utility
 * <p>
 * NOTE:
 * Though retrofit has its own interface based mechanism and doesn't work like this,
 * it's been used here just to give an example.
 */
public class RetrofitRequestBuilder implements IApiRequestBuilder {

    @Override
    public void makePostRequest(RequestParams request, OnHttpRequestCompletedListener listener) {

        // Retrofit specific calling mechanism

        // NOTE:
        // Though retrofit has its own interface based mechanism and doesn't work like this,
        // it's been used here just to give an example.
    }

    @Override
    public void makeGetRequest(RequestParams request, OnHttpRequestCompletedListener listener) {

        // Retrofit specific calling mechanism
    }
}
