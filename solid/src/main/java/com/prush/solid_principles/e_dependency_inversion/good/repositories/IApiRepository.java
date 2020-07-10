package com.prush.solid_principles.e_dependency_inversion.good.repositories;


import com.prush.solid_principles.e_dependency_inversion.good.interfaces.OnRequestCompleteListener;

public interface IApiRepository {

    void loginRequest(String username, String password, OnRequestCompleteListener listener);

    //more apis below
}
