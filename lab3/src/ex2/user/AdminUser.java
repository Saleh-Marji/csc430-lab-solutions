package ex2.user;

public class AdminUser extends User {
    @Override
    public UserType getUserType() {
        return UserType.ADMIN;
    }
}
