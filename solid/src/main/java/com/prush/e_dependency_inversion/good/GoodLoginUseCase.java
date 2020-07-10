package com.prush.e_dependency_inversion.good;

import com.prush.e_dependency_inversion.bad.models.LoginData;
import com.prush.e_dependency_inversion.good.interfaces.OnRequestCompleteListener;
import com.prush.e_dependency_inversion.good.networking.IApiRequestBuilder;
import com.prush.e_dependency_inversion.good.networking.OkHttpRequestBuilder;
import com.prush.e_dependency_inversion.good.networking.RetrofitRequestBuilder;
import com.prush.e_dependency_inversion.good.repositories.GoodApiRepository;

/**
 * Implementation follows DIP as Higher Level module (ApiRepository) now depends upon the abstraction of Lower level module (Networking utility)
 * and is completely unaware of the concrete implementation.
 */
@SuppressWarnings({"DanglingJavadoc", "unused"})
public class GoodLoginUseCase {

    public interface OnLoginListener {
        void onLoginSuccess(LoginData loginData);

        void onLoginFailure(int errorCode);
    }

    private void performLoginAsync(String username, String password, OnLoginListener listener) {

        IApiRequestBuilder okHttpRequestBuilder = new OkHttpRequestBuilder();

        GoodApiRepository goodApiRepository = GoodApiRepository.getInstance(okHttpRequestBuilder);

        goodApiRepository.loginRequest(username, password,
                new OnRequestCompleteListener() {
                    @Override
                    public void onRequestSuccess(LoginData loginData) {
                        listener.onLoginSuccess(loginData);
                    }

                    @Override
                    public void onRequestFailed(int errorCode) {
                        listener.onLoginFailure(errorCode);
                    }
                });

        /**
         * Future implementation:
         *
         * Any implementation of lower level module's abstraction can be injected into higher level module in future, without changing a
         * single line of code.
         *
         * Replacing OkHttp with Retrofit. So easy.
         */
        IApiRequestBuilder retrofitRequestBuilder = new RetrofitRequestBuilder();

        goodApiRepository = GoodApiRepository.getInstance(retrofitRequestBuilder);
        goodApiRepository.loginRequest(username, password,
                new OnRequestCompleteListener() {
                    @Override
                    public void onRequestSuccess(LoginData loginData) {
                        listener.onLoginSuccess(loginData);
                    }

                    @Override
                    public void onRequestFailed(int errorCode) {
                        listener.onLoginFailure(errorCode);
                    }
                });
    }


}


