package logger.publisher;

import logger.subscribers.SubscriberI;

import java.util.ArrayList;
import java.util.List;

public class LogPublisher implements PublisherI{

    private List<SubscriberI> subscibers;

    public LogPublisher(){
        this.subscibers = new ArrayList();
    }

    @Override
    public void subscribe(SubscriberI subscriber) {
        this.subscibers.add(subscriber);
    }

    @Override
    public void unSubscribe(SubscriberI subscriber) {
        this.subscibers.remove(subscriber);
    }

    @Override
    public void notify(String message) {
        for(SubscriberI subscriber: subscibers){
            subscriber.update(message);
        }
    }
}
