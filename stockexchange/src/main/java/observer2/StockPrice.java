package observer2;

public class StockPrice {
    private final float price;
    private final int version;

    public StockPrice(float price, int version) {
        this.price = price;
        this.version = version;
    }

    public float getPrice() {
        return price;
    }

    public int getVersion() {
        return version;
    }
}
