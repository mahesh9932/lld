package fooddelsys.perm;

import fooddelsys.data.FoodItem;
import fooddelsys.data.User;

public class AddToCartPermission implements Permission{

    private final User user;
    private final FoodItem foodItem;

    public AddToCartPermission(User user, FoodItem foodItem){
        this.user = user;
        this.foodItem = foodItem;
    }

    @Override
    public boolean isPermitted() {
        return false;
    }
}
