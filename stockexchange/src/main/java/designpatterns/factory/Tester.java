package designpatterns.factory;

public class Tester {
    public static void main(String[] args) {
        CoffeeServer server = new CoffeeServer();
        server.makeCoffee("capuccino");

    }
}
