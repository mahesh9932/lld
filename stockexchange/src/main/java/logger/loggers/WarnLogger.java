package logger.loggers;

import logger.publisher.PublisherI;

public class WarnLogger extends AbstractLogger{
    public WarnLogger(AbstractLogger nextLogger, PublisherI publisher) {
        super(nextLogger, publisher);
    }

    @Override
    public void log(String message) {
        message  = "WARN: " + message;
        publish(message);
        next(message);
    }
}
