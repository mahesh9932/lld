package logger.loggers;

import logger.publisher.PublisherI;

public class ThirdPartyLogger extends AbstractLogger{
    public ThirdPartyLogger(AbstractLogger nextLogger, PublisherI publisher) {
        super(nextLogger, publisher);
    }

    @Override
    void log(String message) {
        message = "THIRD_PARTY: " + message;
        publish(message);
        next(message);
    }
}
