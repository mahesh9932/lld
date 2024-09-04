package observer.subscriber;

import observer.publisher.Publisher;

public interface Subscriber{
    void subscribe(Publisher publisher);
    void unSubscribe(Publisher publisher);
}
