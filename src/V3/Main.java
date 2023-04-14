package V3;

public class Main {
    public static void main(String[] args) {
        Container<User> container = new Container<>(new User());
        User u = (User) container.doItAndReturn();
    }
}
