package com.prush.c_liskov_substitution.good;

import com.prush.c_liskov_substitution.good.interfaces.IPaidUser;
import com.prush.c_liskov_substitution.good.interfaces.IUser;
import com.prush.c_liskov_substitution.good.models.FreeUser;
import com.prush.c_liskov_substitution.good.models.PaidUser;
import com.prush.c_liskov_substitution.good.usecases.DownloadContentUseCase;
import com.prush.c_liskov_substitution.good.usecases.FetchContentUseCase;

@SuppressWarnings("DanglingJavadoc")
/**
 * This is solution to a class violating LSP.
 * <p>
 * System has two kinds of Users with two different behaviors. Hence create two interfaces.
 * - IUser - should be implemented by users who can browse the content. (Free Users)
 * - IPaidUser - should be implemented by users who can browse and download the content. (Paid Users)
 *
 * Notice nothing much changes for FetchContentUseCase as it still follows the LSP.
 *
 * But, the developer cannot pass object of FreeUser to DownloadContentUseCase anymore,
 * preventing the violation of LSP.
 *
 */
public class GoodUserContentBrowse {

    public static void main(String[] args) {

        FetchContentUseCase fetchContentUseCase = new FetchContentUseCase();
        DownloadContentUseCase downloadContentUseCase = new DownloadContentUseCase();

        IPaidUser paidUser = new PaidUser();

        fetchContentUseCase.fetchContentForUserAsync(paidUser, content -> {

            downloadContentUseCase.downloadContentForUserAsync(paidUser, content, path -> {

            });

        });

        IUser freeUser = new FreeUser();
        fetchContentUseCase.fetchContentForUserAsync(freeUser, content -> {

            /**
             * Following won't compile anymore preventing developer from violating LSP.
             */
//            downloadContentUseCase.downloadContentForUserAsync(freeUser, content, path -> {

//            });

        });
    }

}