package designpatterns.factory;

public class MilkFactory {
    public static Milk getMilk(String type){
        return new CowMilk();
    }
}
