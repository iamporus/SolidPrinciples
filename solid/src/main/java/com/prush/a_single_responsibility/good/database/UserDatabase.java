package com.prush.a_single_responsibility.good.database;

import com.prush.a_single_responsibility.good.models.User;

/**
 * Keeping your Database implementation separate from all business logic should be a must.
 * <p>
 * - The application/business logic should never know/care what kind of database is present underneath.
 * - This allows in easily choosing a different type of database in the future if such a need arise.
 * - This allows to scrap a not needed database altogether in future very easily without touching your business logic.
 */
@SuppressWarnings("ALL")
public class UserDatabase {

    public boolean saveUser(User user) {
        return true;
    }
}
