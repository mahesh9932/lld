//package fooddelsys.apis;
//
//import fooddelsys.data.FoodItem;
//import fooddelsys.data.User;
////import fooddelsys.managers.CartManager;
//import fooddelsys.managers.UserManager;
////import fooddelsys.searchers.FoodItemSearcher;
//
//public class AddToCartAPI {
//    public void addItemToCart(String userToken, int foodItemId){
//        if(userToken == null || userToken.length() == 0 || foodItemId < 0){
//            // throws exception
//        }
//        User user = new UserManager().getUserByToken(userToken);
//        if(user == null){
//            //
//        }
//        FoodItem foodItem = new FoodItemSearcher().searchFoodItemById(foodItemId);
//        if(foodItem == null){
//            //
//        }
//        new CartManager().addItemToCart(user, foodItem);
//    }
//}
