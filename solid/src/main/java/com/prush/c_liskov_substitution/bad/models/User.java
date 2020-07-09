package com.prush.c_liskov_substitution.bad.models;

public abstract class User {

    public abstract Content fetchContent();

    public abstract String downloadContent(Content content);

}