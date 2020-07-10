package com.prush.solid_principles.c_liskov_substitution.good.usecases;

import com.prush.solid_principles.c_liskov_substitution.good.interfaces.IPaidUser;
import com.prush.solid_principles.c_liskov_substitution.good.models.Content;

public class DownloadContentUseCase {

    public interface OnContentDownloadListener {

        void onContentDownloadSuccess(String downloadPath);
    }

    public void downloadContentForUserAsync(IPaidUser user, Content content, OnContentDownloadListener listener) {

        String path = user.downloadContent(content);
        listener.onContentDownloadSuccess(path);
    }
}
