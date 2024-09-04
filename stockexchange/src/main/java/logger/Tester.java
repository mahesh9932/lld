package logger;

import logger.data.LoggerLevel;
import logger.loggers.Logger;

public class Tester {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log(LoggerLevel.DEBUG, "request data");
        logger.log(LoggerLevel.ERROR, "db is failing");
    }
}
