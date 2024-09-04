package logger.loggers;

import logger.publisher.PublisherI;

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(AbstractLogger nextLogger, PublisherI publisher) {
        super(nextLogger, publisher);
    }

    @Override
    public void log(String message) {
        message  = "ERROR: " + message;
        publish(message);
        next(message);
    }
}
