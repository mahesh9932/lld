package logger.publisher;

import logger.subscribers.SubscriberI;

public interface PublisherI{

    void subscribe(SubscriberI subscriber);

    void unSubscribe(SubscriberI subscriber);

    void notify(String message);
}
