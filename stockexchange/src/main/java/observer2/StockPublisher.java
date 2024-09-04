package observer2;

public interface StockPublisher {

    void subscribe(StockSubscriber subscriber);

    void unSubscribe(StockSubscriber subscriber);
    
    void notifyAll(StockName stockName, StockPrice stockPrice);
}
