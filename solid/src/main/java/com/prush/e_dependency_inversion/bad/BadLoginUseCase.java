package com.prush.e_dependency_inversion.bad;

import com.prush.e_dependency_inversion.bad.interfaces.OnRequestCompleteListener;
import com.prush.e_dependency_inversion.bad.models.LoginData;
import com.prush.e_dependency_inversion.bad.repositories.BadApiRepository;
import com.prush.e_dependency_inversion.good.GoodLoginUseCase;
import com.prush.e_dependency_inversion.bad.networking.OkHttpRequestBuilder;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * The system in context has a Higher Level module:
 * @see BadApiRepository - provides set of APIs for a web service.
 *
 * This module directly depends upon a Lower Level module:
 * @see OkHttpRequestBuilder which acts as a network utility to perform API requests.
 * <p>
 *
 * Notice how BadApiRepository has a direct dependency on OkHttpRequestBuilder.
 *
 * Problem with this approach:
 * - This dependency upon lower-level components limits the reusability of the higher-level components.
 * - Lower level modules being tightly coupled with higher level, you cannot change/replace them without making changes to
 * higher level modules.
 *
 * @see GoodLoginUseCase for a solution which follows the principle and fixes the problems.
 */
public class BadLoginUseCase {

    public interface OnLoginListener {
        void onLoginSuccess(LoginData loginData);

        void onLoginFailure(int errorCode);
    }

    public void performLoginAsync(String username, String password, OnLoginListener listener) {

        BadApiRepository.getInstance().loginRequest(username, password,

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


