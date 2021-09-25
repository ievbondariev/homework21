package homework.builder;

public class UserBuilder {

    public String firstName;
    public  String lastName;
    public int age;
    public String phone;
    public String address;

    public UserBuilder(String firstName,String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder phone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public User build() {
        return new User(this);
    }
}
