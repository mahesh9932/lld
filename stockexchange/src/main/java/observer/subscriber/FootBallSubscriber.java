package observer.subscriber;

import observer.publisher.FootBallPublisher;

public interface FootBallSubscriber extends Subscriber {
    void update(FootBallPublisher publisher);
}
