package com.prush.solid_principles.c_liskov_substitution.good.models;

import com.prush.solid_principles.c_liskov_substitution.good.interfaces.IPaidUser;

public class PaidUser extends User implements IPaidUser {

    @Override
    public Content fetchContent() {
        // show all the available content.
        return new Content();
    }

    @Override
    public String downloadContent(Content content) {
        System.out.println("Paid user can additionally download the content if he wants.");
        return "";
    }
}
