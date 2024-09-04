package designpatterns.factory;

public class CoffeeFactory {
    public static Coffee getCoffee(String type){
        Coffee coffee;
        if(type == "capuccino"){
            coffee = new Cappucino(new CappuccinoRecipe());
        }
        else{
            coffee = new Arabica(new AmericanoRecipe());
        }
        return coffee;
    }
}
