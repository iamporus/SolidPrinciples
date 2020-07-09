package com.prush.c_liskov_substitution.good.models;

import com.prush.c_liskov_substitution.good.interfaces.IUser;

public class FreeUser extends User implements IUser {

    @Override
    public Content fetchContent() {
        // show all available content.
        return new Content();
    }

}

