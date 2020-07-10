package com.prush.solid_principles.c_liskov_substitution.bad.models;

public class FreeUser extends User {

    @Override
    public Content fetchContent() {
        // show all the available content.
        return new Content();
    }

    @Override
    public String downloadContent(Content content) {
        throw new UnsupportedOperationException("Free users cannot download content.");
    }
}

