package com.prush.e_dependency_inversion.bad.repositories;

import com.prush.e_dependency_inversion.bad.interfaces.OnRequestCompleteListener;

public interface IApiRepository {

    void loginRequest(String username, String password, OnRequestCompleteListener listener);

    //more apis below
}
