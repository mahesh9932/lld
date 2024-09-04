package logger.loggers;

import logger.publisher.PublisherI;

public class FatalLogger extends AbstractLogger{
    public FatalLogger(AbstractLogger nextLogger, PublisherI publisher) {
        super(nextLogger, publisher);
    }

    @Override
    public void log(String message) {
        message  = "FATAL: " + message;
        publish(message);
        next(message);
    }
}
