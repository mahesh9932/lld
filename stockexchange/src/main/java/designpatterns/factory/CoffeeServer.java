package designpatterns.factory;

public class CoffeeServer {
    Coffee coffee;

    public void makeCoffee(String type){
        coffee = CoffeeFactory.getCoffee(type);
        coffee.brew();
        coffee.pour();
    }

}
