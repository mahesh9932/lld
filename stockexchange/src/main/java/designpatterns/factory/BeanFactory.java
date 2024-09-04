package designpatterns.factory;

public class BeanFactory {

    public static Bean getBean(String type){
        return new AmericanBean();
    }
}
