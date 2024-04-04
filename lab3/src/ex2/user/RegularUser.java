package ex2.user;

public class RegularUser extends User {
    @Override
    public UserType getUserType() {
        return UserType.USER;
    }
}
