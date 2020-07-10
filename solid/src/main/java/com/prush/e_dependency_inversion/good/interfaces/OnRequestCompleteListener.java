package com.prush.e_dependency_inversion.good.interfaces;

import com.prush.e_dependency_inversion.bad.models.LoginData;

public interface OnRequestCompleteListener {

        void onRequestSuccess(LoginData loginData);

        void onRequestFailed(int errorCode);
    }