package fooddelsys.filters;

import fooddelsys.data.CuisineType;
import fooddelsys.data.FoodItem;
import fooddelsys.data.Restaurant;

import java.util.List;

public class CuisineFilter implements FoodItemFilter, RestaurantFilter{
    private final List<CuisineType> cuisines;

    public CuisineFilter(List<CuisineType> cuisines){
        this.cuisines = cuisines;
    }
    @Override
    public boolean filter(FoodItem foodItem) {
        return cuisines.contains(foodItem.getCuisineType());
    }

    @Override
    public boolean filter(Restaurant restaurant) {
        List<CuisineType> restaurantCuisines = restaurant.getCuisines();
        for(CuisineType cuisine: restaurantCuisines){
            if(cuisines.contains(cuisine))
                return true;
        }
        return false;
    }
}
