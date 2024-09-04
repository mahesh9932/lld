package logger.loggers;

import logger.publisher.PublisherI;

public class DebugLogger extends AbstractLogger{

    public DebugLogger(AbstractLogger nextLogger, PublisherI publisher){
       super(nextLogger, publisher);
    }

    public void log(String message){
        message = "DEBUG: " + message;
        publish(message);
        next(message);
    }
}
