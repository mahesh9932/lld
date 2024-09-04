package fooddelsys.data;

import java.util.List;

public class Restaurant {
    private final int id;
    private final String name;
    private final String description;
    private final MealType mealType;
    private final List<CuisineType> cuisines;
    private final StarRating rating;
//    private final Menu menu;
    private final String location;
    private final Timings timings;

    public Restaurant(int id, String name, String description, MealType mealType, List<CuisineType> cuisines, StarRating rating, String location, Timings timings) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.mealType = mealType;
        this.cuisines = cuisines;
        this.rating = rating;
        this.location = location;
        this.timings = timings;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public MealType getMealType() {
        return mealType;
    }

    public List<CuisineType> getCuisines() {
        return cuisines;
    }

//    public Menu getMenu() {
//        return menu;
//    }

    public String getLocation() {
        return location;
    }

    public Timings getTimings() {
        return timings;
    }

    public StarRating getRating() {
        return rating;
    }
}
