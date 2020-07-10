package com.prush.solid_principles.e_dependency_inversion.bad.repositories;

import com.prush.solid_principles.e_dependency_inversion.bad.interfaces.OnRequestCompleteListener;
import com.prush.solid_principles.e_dependency_inversion.bad.models.LoginData;
import com.prush.solid_principles.e_dependency_inversion.bad.models.RequestParams;
import com.prush.solid_principles.e_dependency_inversion.bad.networking.OkHttpRequestBuilder;

/**
 * This Repository is a Higher-Level Module which provides implementation of available APIs listed in IApiRepository interface.
 * <p>
 * It could depend upon a 3rd-Party networking utility/library (A Lower-Level Module) like
 * <p>
 * - OkHttp, Apache HTTPClient,Retrofit, Volley
 * <p>
 *
 * This class uses OkHttp as a networking utility to make API request.
 *
 * @see OkHttpRequestBuilder - serves as a Lower-level module which is a direct dependeny of BadApiRepository
 */
@SuppressWarnings("DanglingJavadoc")
public class BadApiRepository implements IApiRepository {

    private BadApiRepository() {
    }

    @Override
    public void loginRequest(String username, String password, OnRequestCompleteListener listener) {

        //WebServer specific request code (url endpoint, headers and stuff)
        RequestParams requestParams = new RequestParams();

        //lower level module
        OkHttpRequestBuilder okHttpRequestBuilder = new OkHttpRequestBuilder();
        okHttpRequestBuilder.makePutRequest(requestParams, new OkHttpRequestBuilder.OnHttpRequestCompletedListener() {
            @Override
            public void onHttpRequestSuccess(Object responseObject) {
                listener.onRequestSuccess((LoginData) responseObject);
            }

            @Override
            public void onHttpRequestFailed(int errorCode) {

            }
        });

        /**
         * See how this higher level module (BadApiRepository) is directly depending on a lower level detail (OkHttpRequestBuilder).
         *
         * This violets Open/Close principle and in turn Dependency Inversion principle as any future changes to okHttp APIs or
         * decisions to change to a different networking utility (eg. Retrofit) in future, results in modifications to this class.
         */
    }

    public static BadApiRepository getInstance() {
        //DON'T DO THIS EVER!
        return new BadApiRepository();
    }

}
