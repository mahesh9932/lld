package observer.publisher;

import observer.subscriber.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unSubscribe(Subscriber subscriber);
}
