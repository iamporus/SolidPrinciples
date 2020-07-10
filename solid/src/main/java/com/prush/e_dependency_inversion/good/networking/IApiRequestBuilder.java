package com.prush.e_dependency_inversion.good.networking;


import com.prush.e_dependency_inversion.good.GoodLoginUseCase;
import com.prush.e_dependency_inversion.good.models.RequestParams;

/**
 * This is an abstraction extracted out from earlier direct dependency of lower-level module (networking logic)
 * onto its parent - higher level module
 * <p>
 * This interface allows to invert the dependency.
 *
 * @see GoodLoginUseCase for more info.
 */
public interface IApiRequestBuilder {

    interface OnHttpRequestCompletedListener {
        void onHttpRequestSuccess(Object responseObject);

        void onHttpRequestFailed(int errorCode);
    }

    void makePostRequest(RequestParams request, OnHttpRequestCompletedListener listener);

    void makeGetRequest(RequestParams request, OnHttpRequestCompletedListener listener);

}
