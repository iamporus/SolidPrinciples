package com.prush.c_liskov_substitution.good.usecases;

import com.prush.c_liskov_substitution.good.interfaces.IUser;
import com.prush.c_liskov_substitution.good.models.Content;

public class FetchContentUseCase {

    public interface OnContentFetchedListener {

        void onContentFetchSuccess(Content content);
    }

    public void fetchContentForUserAsync(IUser user, OnContentFetchedListener listener) {

        Content content = user.fetchContent();
        listener.onContentFetchSuccess(content);
    }
}
