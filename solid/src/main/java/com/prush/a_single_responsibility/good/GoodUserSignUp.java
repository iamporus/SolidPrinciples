package com.prush.a_single_responsibility.good;

import com.prush.a_single_responsibility.good.database.UserDatabase;
import com.prush.a_single_responsibility.good.models.Credentials;
import com.prush.a_single_responsibility.good.models.User;
import com.prush.a_single_responsibility.good.usecases.RegisterUserUseCase;
import com.prush.a_single_responsibility.good.utility.Validator;

@SuppressWarnings({"unused", "DanglingJavadoc"})
/**
 * This class follows Single Responsibility Principle and splits the responsibilities into different classes.
 * <p>
 * - validating passed in user credentials
 * @see Validator
 *
 * - registering user by making an API request,
 * @see RegisterUserUseCase
 *
 * - saving user details in local database.
 * @see UserDatabase
 *
 * <p>
 * Benefits with this approach:
 * - Changes needed in any of these three responsibilities would require change in respective classes.
 * - Easy to unit test as the multiple functionalities are now isolated.
 * - A change in any of the functionalities would require testing of just the respecitve functionality.
 */
public class GoodUserSignUp {

    /**
     * Assume this method gets invoked on clicking Sign Up button of your awesome Mobile app or Web app.
     */
    public void signUp(String emailId, String password) {

        Credentials credentials = new Credentials(emailId, password);

        if (Validator.areCredentialsValid(credentials)) {

            registerUserUseCase.registerUser(credentials, new RegisterUserUseCase.OnRegisterUserListener() {
                @Override
                public void onRegisterUserSuccess() {

                    userDatabase.saveUser(new User());
                }

                @Override
                public void onRegisterUserFailed(int errorCode) {
                }
            });
        }
    }

    private final RegisterUserUseCase registerUserUseCase;
    private final UserDatabase userDatabase;

    /**
     * See how the required dependencies are constructor injected instead of instantiating here itself.
     * It allows to pass in test doubles or mocks at the time of unit testing this component.
     *
     * @param registerUserUseCase RegisterUserUseCase
     * @param userDatabase        UserDatabase
     */
    public GoodUserSignUp(RegisterUserUseCase registerUserUseCase, UserDatabase userDatabase) {
        this.registerUserUseCase = registerUserUseCase;
        this.userDatabase = userDatabase;
    }
}


