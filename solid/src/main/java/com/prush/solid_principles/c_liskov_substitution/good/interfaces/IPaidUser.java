package com.prush.solid_principles.c_liskov_substitution.good.interfaces;

import com.prush.solid_principles.c_liskov_substitution.good.models.Content;

public interface IPaidUser extends IUser {
    String downloadContent(Content content);
}
