//package fooddelsys.searchers;
//import fooddelsys.data.FoodItem;
//import fooddelsys.filters.FoodItemFilter;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class FoodItemSearcher {
//    public List<FoodItem> searchFoodItems(String itemName, List<FoodItemFilter> filters){
//        if(itemName == null || itemName.length() == 0){
//            throw new IllegalArgumentException("item name not found");
//        }
//        Results results = DataAccesor.getFoodItemsByName(itemName);
//        List<FoodItem> foodItems = DataAccessObjectConverter.convertToFoodItems(results);
//        for(FoodItemFilter filter: filters){
//            List<FoodItem> filteredFoodItems = new ArrayList<>();
//            for(FoodItem foodItem: foodItems){
//                if(filter.filter(foodItem))
//                    filteredFoodItems.add(foodItem);
//            }
//            foodItems = filteredFoodItems;
//        }
//        return foodItems;
//    }
//
//    public FoodItem searchFoodItemById(int id){
//        return null;
//    }
//}
