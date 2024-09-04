package fooddelsys.data;

public class CartItem {

    private final FoodItem foodItem;
    private final int qty;

    public CartItem(FoodItem foodItem, int qty){
        this.foodItem = foodItem;
        this.qty = qty;
    }

    public FoodItem getFoodItem(){
        return this.foodItem;
    }

    public int getQty(){return  this.qty;}
}
