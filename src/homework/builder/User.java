package homework.builder;

public class User {

    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String address;

    public User(UserBuilder build) {

        this.firstName = build.firstName;
        this.lastName = build.lastName;
        this.age = build.age;
        this.phone = build.phone;
        this.address = build.address;
    }

    public String getString() {
        return this.firstName + ", " + this.lastName + ", " + this.age + ", " + this.phone + ", " + this.address;
    }
}
