package logger.data;

public enum LoggerLevel {
    DEBUG(0),
    INFO(1),
    WARN(2),
    ERROR(3),
    FATAL(4);

    private int level;

    LoggerLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return this.level;
    }

}
