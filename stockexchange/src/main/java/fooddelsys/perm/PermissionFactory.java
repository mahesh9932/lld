package fooddelsys.perm;

import fooddelsys.data.FoodItem;
import fooddelsys.data.User;

public class PermissionFactory {

    private PermissionFactory(){}

    public static Permission getAddToCartPermission(User user, FoodItem foodItem){
        return new AddToCartPermission(user, foodItem);
    }
}
