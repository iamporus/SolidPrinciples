package com.prush.solid_principles.c_liskov_substitution.bad.models;

public class PaidUser extends User {

    @Override
    public Content fetchContent() {
        // show all the available content.
        return new Content();
    }

    @Override
    public String downloadContent(Content content) {
        System.out.println("Paid user: Content downloaded successfully!");
        return "";
    }
}

