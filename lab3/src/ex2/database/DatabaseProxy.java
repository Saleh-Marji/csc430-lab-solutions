package ex2.database;

import ex2.user.User;
import ex2.user.UserType;

public class DatabaseProxy implements Database {
    private final Database database = RealDatabase.getInstance();

    @Override
    public void queryData(User user) throws IllegalAccessException {
        if(user.getUserType() != UserType.ADMIN) {
            throw new IllegalAccessException("User must be admin to access this query");
        }
        database.queryData(user);
    }
}
