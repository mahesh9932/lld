package observer.publisher;

import observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class AbstractPublisher implements Publisher {
    public List<Subscriber> subscribers = new ArrayList();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
