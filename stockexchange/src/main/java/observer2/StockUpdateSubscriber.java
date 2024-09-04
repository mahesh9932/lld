package observer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockUpdateSubscriber implements StockSubscriber{
    private List<StockPublisher> publishers;
    private final String name;

    private Map<StockName, StockPrice> stocksData;

    public StockUpdateSubscriber(String name){
        this.name = name;
        publishers = new ArrayList();
        stocksData = new HashMap();
    }
    public void subscribe(StockPublisher publisher) {
        publishers.add(publisher);
        publisher.subscribe(this);
    }

    public void unSubscribe(StockPublisher publisher) {
        publishers.remove(publisher);
        publisher.unSubscribe(this);
    }

    public void updateStock(StockName stockName, StockPrice stockPrice) {
            if(!stocksData.containsKey(stockName) || stocksData.get(stockName).getVersion() < stockPrice.getVersion()){
                stocksData.put(stockName, stockPrice);
            }
    }

    public void displayStockData(){
        for(Map.Entry<StockName, StockPrice> entry: stocksData.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue().getPrice());
        }
    }
}
