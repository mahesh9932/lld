package observer2;

public interface StockSubscriber {
    void subscribe(StockPublisher publisher);

    void unSubscribe(StockPublisher publisher);

    void updateStock(StockName stockName, StockPrice stockPrice);
}
