package ex2.user;

public enum UserType {
    USER, ADMIN;

    @Override
    public String toString() {
        return name();
    }
}
