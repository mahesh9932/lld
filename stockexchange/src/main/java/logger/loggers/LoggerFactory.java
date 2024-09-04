package logger.loggers;

import logger.data.LoggerLevel;
import logger.publisher.LogPublisher;
import logger.publisher.PublisherI;
import logger.subscribers.ConsoleLogger;
import logger.subscribers.FileLogger;

public class LoggerFactory {
    private LoggerFactory(){}

    public static AbstractLogger getLogger(LoggerLevel loggerLevel){
        PublisherI debugInfoPublisher = new LogPublisher();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        debugInfoPublisher.subscribe(consoleLogger);
        PublisherI otherPublisher = new LogPublisher();
        otherPublisher.subscribe(consoleLogger);
        otherPublisher.subscribe(fileLogger);
        switch (loggerLevel){
            case DEBUG:
                return new DebugLogger(null, debugInfoPublisher);
            case INFO:
                return new InfoLogger(null, debugInfoPublisher);
            case WARN:
                return new WarnLogger(null, otherPublisher);
            case ERROR:
                return new ErrorLogger(new ThirdPartyLogger(null, otherPublisher), otherPublisher);
             default:
                return new FatalLogger(null, otherPublisher);
        }
    }
}
