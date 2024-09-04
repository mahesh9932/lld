//package fooddelsys.searchers;
//
//import fooddelsys.data.Restaurant;
//import fooddelsys.filters.RestaurantFilter;
//import java.util.ArrayList;
//import java.util.List;
//
//public class RestaurantSearcher {
//    public List<Restaurant> searchRestaurants(String name, List<RestaurantFilter> filters){
//        if(name == null || name.length() == 0){
//            throw new IllegalArgumentException("invalid input");
//        }
//        Results results = DBAccesor.getRestaurantsByName(name);
//        List<Restaurant> restaurants = DBObjectConverter.covertToRestaurants(results);
//        for(RestaurantFilter filter: filters){
//            List<Restaurant> filteredRestaurants = new ArrayList<>();
//            for(Restaurant restaurant: restaurants){
//                if(filter.filter(restaurant))
//                    filteredRestaurants.add(restaurant);
//            }
//            restaurants = filteredRestaurants;
//        }
//        return restaurants;
//    }
//
//    public Restaurant searchById(int id){
//        Results results = DBAccessor.getRestaurantById(id);
//        Restaurant restaurant = DBObjectConverter.convertToRestaurant(results);
//        return restaurant;
//    }
//}
