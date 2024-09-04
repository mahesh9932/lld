package designpatterns.factory;

public class CappuccinoRecipe implements Recipe{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
    return new CowMilk();
    }
}
