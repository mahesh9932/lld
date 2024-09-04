package logger.loggers;

import logger.data.LoggerLevel;

public class Logger {
    private static Logger currentLogger;

    private Logger(){}

    public static Logger getLogger(){
        if(Logger.currentLogger == null){
            Logger.currentLogger = new Logger();
        }
        return Logger.currentLogger;
    }

    public void log(LoggerLevel loggerLevel, String message){
        AbstractLogger logger = LoggerFactory.getLogger(loggerLevel);
        logger.log(message);
    }
}
