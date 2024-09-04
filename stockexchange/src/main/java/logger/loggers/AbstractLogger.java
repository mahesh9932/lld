package logger.loggers;

import logger.data.LoggerLevel;
import logger.publisher.PublisherI;

public abstract class AbstractLogger {

    private final AbstractLogger nextLogger;
    private final PublisherI publisher;

    protected AbstractLogger(AbstractLogger nextLogger, PublisherI publisher){
        this.nextLogger = nextLogger;
        this.publisher = publisher;
    }

    public void publish(String message){
        if(this.publisher!= null){
            publisher.notify(message);
        }
    }

    public void next(String message){
        if(nextLogger != null){
            nextLogger.log(message);
        }
    }

    abstract void log(String message);
}
