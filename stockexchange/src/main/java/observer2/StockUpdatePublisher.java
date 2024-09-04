package observer2;

import java.util.ArrayList;
import java.util.List;

public class StockUpdatePublisher implements StockPublisher{
    
    
    private final String name;
    private List<StockSubscriber> subscribers;
    
    public StockUpdatePublisher(String name){
        this.name = name;
        subscribers = new ArrayList();
    }
    
    public void subscribe(StockSubscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public void unSubscribe(StockSubscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notifyAll(StockName stockName, StockPrice stockPrice) {

    }
}
