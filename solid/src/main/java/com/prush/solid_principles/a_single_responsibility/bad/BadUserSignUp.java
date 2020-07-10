package com.prush.solid_principles.a_single_responsibility.bad;

@SuppressWarnings("ALL")

/**
 * Responsibility of this class seems to be
 * <p>
 * - validating passed in user credentials,
 * - registering user by making an API request,
 * - saving user details in local database.
 * <p>
 * Problems with this approach:
 * - Even a single change needed in any of these three responsibilities would require a change in this class.
 * - Difficult to unit test this class as the multiple functionalities are combined and unit testing needs components in isolation.
 * - A change in any of the functionalities would require testing of all three functionalities.
 *
 * @see com.prush.solid_principles.a_single_responsibility.good.GoodUserSignUp for a solution which splits the
 * functionalities/responsibilites into separate classes.
 */

public class BadUserSignUp {

    /**
     * Assume this method gets invoked on clicking Sign Up button of your awesome Mobile app or Web app.
     */
    public void signUp(String emailId, String password) {

        if (emailId.isEmpty() || password.isEmpty()) {
            System.out.println("Empty credentials.");
            return;
        }

        if (!isValidEmail(emailId)) {
            System.out.println("Invalid email.");
            return;
        }

        registerUser(emailId, password);
    }

    @SuppressWarnings("ConstantConditions")
    private void registerUser(String emailId, String password) {

        // perform network request
        boolean result = true;

        if (result) {
            saveUserInDatabase(emailId, password);
        } else {
            System.out.println("Failed to register.");
        }

    }

    private void saveUserInDatabase(String emailId, String password) {

        //perform hash of password
        //store user details in db
    }

    private boolean isValidEmail(String username) {
        // some pattern matching to check if passed in email is valid

        return true;
    }

}


