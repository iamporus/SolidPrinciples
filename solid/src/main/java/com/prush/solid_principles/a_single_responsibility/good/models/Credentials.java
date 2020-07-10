package com.prush.solid_principles.a_single_responsibility.good.models;

public class Credentials {

    private final String emailId;
    private final String password;

    public Credentials(final String emailId, final String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }
}