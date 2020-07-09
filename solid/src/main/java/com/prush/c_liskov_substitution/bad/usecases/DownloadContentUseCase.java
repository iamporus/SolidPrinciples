package com.prush.c_liskov_substitution.bad.usecases;

import com.prush.c_liskov_substitution.bad.models.Content;
import com.prush.c_liskov_substitution.bad.models.User;

public class DownloadContentUseCase {

    public interface OnContentDownloadListener {

        void onContentDownloadSuccess(String downloadPath);
    }

    public void downloadContentForUserAsync(User user, Content content, OnContentDownloadListener listener) {

        String path = user.downloadContent(content);
        listener.onContentDownloadSuccess(path);
    }
}
