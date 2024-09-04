package designpatterns.factory;

public class AmericanoRecipe implements Recipe{
    @Override
    public Bean getBean() {
        return new AmericanBean();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }
}
