//package fooddelsys.apis;
//import fooddelsys.data.CuisineType;
//import fooddelsys.data.FoodItem;
//import fooddelsys.data.MealType;
//import fooddelsys.data.StarRating;
//import fooddelsys.filters.CuisineFilter;
//import fooddelsys.filters.FoodItemFilter;
//import fooddelsys.filters.MealTypeFilter;
//import fooddelsys.filters.StarRatingFilter;
////import fooddelsys.searchers.FoodItemSearcher;
//import java.util.ArrayList;
//import java.util.List;
//
//public class FoodItemSearcherAPI {
//    public List<FoodItem> searchFoodItem(String itemName, MealType mealType, List<CuisineType> cuisines, StarRating rating){
//        if(itemName == null || itemName.length() == 0){
//            throw new IllegalArgumentException("invalid item name");
//        }
//        List<FoodItemFilter> filters = new ArrayList<>();
//        if(mealType != null)
//            filters.add(new MealTypeFilter(mealType));
//        if(cuisines!=null && cuisines.size() > 0)
//            filters.add(new CuisineFilter(cuisines));
//        if(rating!=null)
//            filters.add(new StarRatingFilter(rating));
//        return new FoodItemSearcher().searchFoodItems(itemName, filters);
//    }
//}
