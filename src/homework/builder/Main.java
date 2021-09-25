package homework.builder;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder("Ivan", "Ivanov")
                .age(18)
                .phone("380958880808")
                .address("Lvov")
                .build();

        System.out.println(user.getString());
    }
}
