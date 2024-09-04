package observer.subscriber;

import observer.publisher.CricketPublisher;

public interface CricketSubscriber extends Subscriber {
    void update(CricketPublisher publisher);
}
