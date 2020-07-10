package com.prush.solid_principles.e_dependency_inversion.bad.interfaces;

import com.prush.solid_principles.e_dependency_inversion.bad.models.LoginData;

public interface OnRequestCompleteListener {

        void onRequestSuccess(LoginData loginData);

        void onRequestFailed(int errorCode);
    }