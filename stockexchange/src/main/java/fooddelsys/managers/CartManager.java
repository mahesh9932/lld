//package fooddelsys.managers;
//
//import fooddelsys.data.CartItem;
//import fooddelsys.data.FoodItem;
//import fooddelsys.data.User;
//import fooddelsys.perm.Permission;
//import fooddelsys.perm.PermissionFactory;
//
//import java.util.List;
//
//public class CartManager {
//
//    public List<CartItem> getUserCart(User user){
//
//    }
//
//    public void addItemToCart(User user, FoodItem foodItem){
//        if(user == null || foodItem == null){
//            throw new IllegalArgumentException("invalid args");
//        }
//        Permission permission = PermissionFactory.getAddToCartPermission(user, foodItem);
//        if(!permission.isPermitted()){
//            throw new RuntimeException("no permission");
//        }
//        if(!foodItem.getIsAvailable()){
//            throw new RuntimeException("no permission");
//        }
//
//    }
//
//    public void deleteItemFromCart(User user, FoodItem foodItem){
//
//    }
//
//    public void checkoutCart(User user){
//
//    }
//
//}
