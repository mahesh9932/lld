package designpatterns.builder;

public class Tester {
    public static void main(String[] args) {
        User u1 = new User.Builder(1, "mah").setAge(10).build();
    }
}
