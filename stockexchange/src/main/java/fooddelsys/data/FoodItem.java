package fooddelsys.data;

public class FoodItem {
    private final int id;
    private final String name;
    private final String description;
    private final MealType mealType;
    private final CuisineType cuisineType;
    private final StarRating rating;
    private final int restaurantId;
    private final boolean isAvailable;


    public FoodItem(Builder builder) {
        this.id = builder.getId();
        this.name = builder.getName();
        this.description = builder.getDescription();
        this.mealType = builder.getMealType();
        this.cuisineType = builder.getCuisineType();
        this.rating = builder.getRating();
        this.restaurantId = builder.getRestaurantId();
        this.isAvailable = builder.getIsAvailable();
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

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public StarRating getRating() {
        return rating;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public boolean getIsAvailable(){
        return isAvailable;
    }


    public static class Builder{
        private final int id;
        private final String name;
        private  String description;
        private  MealType mealType;
        private  CuisineType cuisineType;
        private  StarRating rating;
        private final int restaurantId;
        private boolean isAvailable;

        public Builder(int id, String name, int restaurantId){
            this.id = id;
            this.name = name;
            this.restaurantId = restaurantId;
        }

        public Builder setDescription(String description){
            this.description = description;
            return this;
        }
        public Builder setMealType(MealType mealType){
            this.mealType = mealType;
            return this;
        }

        public Builder setIsAvailable(boolean isAvailable){
            this.isAvailable = isAvailable;
            return this;
        }

        public Builder setCuisineType(CuisineType cuisineType){
            this.cuisineType = cuisineType;
            return this;
        }

        public Builder setStarRating(StarRating rating){
            this.rating = rating;
            return this;
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

        public CuisineType getCuisineType() {
            return cuisineType;
        }

        public StarRating getRating() {
            return rating;
        }

        public int getRestaurantId() {
            return restaurantId;
        }
        public boolean getIsAvailable(){return isAvailable;}


        public FoodItem build(){
            return new FoodItem(this);
        }


    }

}
