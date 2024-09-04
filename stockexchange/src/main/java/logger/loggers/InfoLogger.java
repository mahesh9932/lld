package logger.loggers;

import logger.publisher.PublisherI;

public class InfoLogger extends AbstractLogger{

    public InfoLogger(AbstractLogger nextLogger, PublisherI publisher) {
        super(nextLogger, publisher);
    }

    @Override
    public void log(String message) {
        message  = "INFO: " + message;
        publish(message);
        next(message);
    }
}
