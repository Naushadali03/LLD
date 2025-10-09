public abstract class LogProcessor {
    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;
    public static final int FATAL=4;
    int level;
    LogProcessor nexLogProcessor;
    public void setNextDoor(LogProcessor nexLogProcessor){
        this.nexLogProcessor=nexLogProcessor;
    }
    public void logMessage(int level,String message){
        if(this.level<=level){
            write(message);
        }
        if(this.nexLogProcessor!=null){
            this.nexLogProcessor.logMessage(level, message);
        }
    }
    public abstract void write(String message);
}
