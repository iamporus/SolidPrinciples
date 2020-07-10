package com.prush.solid_principles.a_single_responsibility.good.utility;

import com.prush.solid_principles.a_single_responsibility.good.models.Credentials;

/**
 * A separate utility class for performing validations on user credentials.
 * This separation helps in adding future validations with ease.
 */
public class Validator {

    /**
     * Checks if passed in credentials are valid or not.
     *
     * @param credentials Credentials
     * @return boolean -
     */
    public static boolean areCredentialsValid(Credentials credentials) {

        if (credentials.getEmailId().isEmpty() || credentials.getPassword().isEmpty()) {
            System.out.println("Empty credentials.");
            return false;
        }

        if (!isValidEmail(credentials.getEmailId())) {
            System.out.println("Invalid email.");
            return false;
        }

        // any future validations required

        /**
         * Note: In production code, you want to throw a specific validation related error instead of returning a boolean.
         * That will allow you to show a specific error to user.
         */

        return true;
    }

    private static boolean isValidEmail(String username) {
        // some pattern matching to check if passed in email is valid

        return true;
    }
}