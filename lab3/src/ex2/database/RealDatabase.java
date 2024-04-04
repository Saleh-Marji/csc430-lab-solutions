package ex2.database;

import ex2.user.User;

public class RealDatabase implements Database {

    private RealDatabase() {}

    private static final RealDatabase instance = new RealDatabase();

    protected static RealDatabase getInstance() {
        return instance;
    }

    @Override
    public void queryData(User user) {
        System.out.printf("Querying sensitive data by user %s%n", user.getUserType());
    }
}
