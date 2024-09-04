package designpatterns.factory;

public abstract class Coffee {

    private Bean bean;
    private Milk milk;

    public Coffee(Recipe recipe){
        this.bean = recipe.getBean();
        this.milk = recipe.getMilk();
    }


    abstract void brew();

    abstract void pour();

}
