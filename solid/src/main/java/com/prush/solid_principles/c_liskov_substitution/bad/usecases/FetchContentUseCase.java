package com.prush.solid_principles.c_liskov_substitution.bad.usecases;

import com.prush.solid_principles.c_liskov_substitution.bad.models.Content;
import com.prush.solid_principles.c_liskov_substitution.bad.models.User;

public class FetchContentUseCase {

    public interface OnContentFetchedListener {

        void onContentFetchSuccess(Content content);
    }

    public void fetchContentForUserAsync(User user, OnContentFetchedListener listener) {

        Content content = user.fetchContent();
        listener.onContentFetchSuccess(content);
    }
}
