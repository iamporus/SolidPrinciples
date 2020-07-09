package com.prush.c_liskov_substitution.bad;

import com.prush.c_liskov_substitution.bad.models.FreeUser;
import com.prush.c_liskov_substitution.bad.models.PaidUser;
import com.prush.c_liskov_substitution.bad.models.User;
import com.prush.c_liskov_substitution.bad.usecases.DownloadContentUseCase;
import com.prush.c_liskov_substitution.bad.usecases.FetchContentUseCase;
import com.prush.c_liskov_substitution.good.GoodUserContentBrowse;

/**
 * This is a driver class which creates different types of users and fetches dummy content according to their privileges.
 * <p>
 * System has two kinds of Users:
 * - Free User - can browse content.
 * - Paid User - can browse and download content.
 *
 * <p>
 * There are two use cases for two functionalities.
 * - Fetch content to display to user so that he can browse through.
 * - download content optionally for premium (paid) users.
 * <p>
 * The example follows LSP for FetchContentUseCase but fails to follow it for DownloadContentUseCase.
 * <p>
 * Problem with this approach:
 * - Notice that both, Free and Paid users are derived classes from User class.
 * This allows the developer to pass object of free user to DownloadContentUseCase. But as per the
 * requirement, Free users shouldn't be able to download any content.
 * <p>
 * This violates the LSP, as the DownloadContentUseCase behaves differently for subclasses PaidUser and FreeUser.
 *
 * @see GoodUserContentBrowse for a solution which follows the principle and fixes the problems.
 */

@SuppressWarnings("DanglingJavadoc")
class BadUserContentBrowse {

    public static void main(String[] args) {

        FetchContentUseCase fetchContentUseCase = new FetchContentUseCase();
        DownloadContentUseCase downloadContentUseCase = new DownloadContentUseCase();

        User paidUser = new PaidUser();
        //Paid user can browse content.
        fetchContentUseCase.fetchContentForUserAsync(paidUser, content -> {

            downloadContentUseCase.downloadContentForUserAsync(paidUser, content, path -> {
                //Paid user can download content.
            });

        });

        User freeUser = new FreeUser();
        //free user can browse content.
        fetchContentUseCase.fetchContentForUserAsync(freeUser, content -> {

            //free user cannot download the content. Yet this method accepts Free users to be passed and in turn throws an exception.
            /**
             * Following throws an exception.
             * Notice how DownloadContentUseCase behaves differently for subclasses violating the LSP principle.
             */
            downloadContentUseCase.downloadContentForUserAsync(freeUser, content, path -> {

            });

        });

        //Action: Head over to GoodUserContentBrowse inside good package in order to see how to fix this problem.

    }
}