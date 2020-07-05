package com.prush.a_single_responsibility.good.usecases;

import com.prush.a_single_responsibility.good.models.Credentials;

/**
 * A Use Case extracted out for a particular responsibility.
 * This helps in isolating a unit amount of work which can be implemented by a peer in isolation.
 * Also, it becomes very easy to unit test.
 */
public class RegisterUserUseCase {

    public void registerUser(Credentials credentials, OnRegisterUserListener onRegisterUserListener) {

        // network request code goes here.
    }

    public interface OnRegisterUserListener {

        void onRegisterUserSuccess();

        void onRegisterUserFailed(int errorCode);
    }

}