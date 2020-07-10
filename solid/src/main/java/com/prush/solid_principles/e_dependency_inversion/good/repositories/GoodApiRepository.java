package com.prush.solid_principles.e_dependency_inversion.good.repositories;

import com.prush.solid_principles.e_dependency_inversion.good.interfaces.OnRequestCompleteListener;
import com.prush.solid_principles.e_dependency_inversion.good.networking.IApiRequestBuilder;
import com.prush.solid_principles.e_dependency_inversion.good.models.RequestParams;

/**
 * Following implementation follows DIP as Higher Level module (ApiRepository) receives the abstraction of Lower level module (Networking utility)
 * and is completely unaware of the concrete implementation.
 * <p>
 * Notice how any implementation of lower level module's abstraction can be injected into higher level module in future, without changing a
 * single line of code.
 */
public class GoodApiRepository implements IApiRepository {

    private IApiRequestBuilder apiRequestBuilder;

    private GoodApiRepository(IApiRequestBuilder apiRequestBuilder) {
        this.apiRequestBuilder = apiRequestBuilder;
    }

    /**
     * Notice how it depends upon an abstraction.
     */
    public static GoodApiRepository getInstance(IApiRequestBuilder apiRequestBuilder) {
        //DON'T DO THIS EVER!
        return new GoodApiRepository(apiRequestBuilder);
    }

    public void loginRequest(String username, String password, OnRequestCompleteListener listener) {

        //WebServer specific request code (url endpoint, headers and stuff)
        RequestParams requestParams = new RequestParams();

        //lower level module.
        apiRequestBuilder.makePostRequest(requestParams, new IApiRequestBuilder.OnHttpRequestCompletedListener() {
            @Override
            public void onHttpRequestSuccess(Object responseObject) {

            }

            @Override
            public void onHttpRequestFailed(int errorCode) {

            }
        });

        //higher level module (ApiRepository) is totally unaware about the implementation details of lower level module (OkHttpRequestBuilder).

        //This follows the Open/Close principle and in turn Dependency Inversion principle as any future changes to Volley APIs or
        //decisions to change to a different networking utility (eg. Retrofit) in future, doesn't require a single modification to this class.
    }

}
