package ex2.database;

import ex2.user.User;

public interface Database {
    void queryData(User user) throws IllegalAccessException;
}
