public class LoggerDemo {
    public static void main(String[] args) {
        System.out.println("##### Chain of Responsiblity Design Pattern #####");
        LogProcessor logProcessor=getChainOfLoggers();
        System.out.println("Logging Message...");
        System.out.println("=====Logging Debug Message====");
        logProcessor.logMessage(LogProcessor.DEBUG, "this is a debug message");
        System.out.println("=====Logging Info Message=====");
        logProcessor.logMessage(LogProcessor.INFO, "this is a info message...");
        System.out.println("====Logging Error Message=====");
        logProcessor.logMessage(LogProcessor.ERROR, "this is error message....");
        System.out.println("=====Loggin Fatal Message======");
        logProcessor.logMessage(LogProcessor.FATAL, "this is fatal message...");

    }
    public static LogProcessor getChainOfLoggers(){
        LogProcessor fataLogger = new FatalLogProcess(LogProcessor.FATAL);
        LogProcessor errorLogger = new ErrorLogProcess(LogProcessor.ERROR);
        LogProcessor infoLogProcessor = new InfoLogProcess(LogProcessor.INFO);
        LogProcessor debugLogger = new DebugLogProcess(LogProcessor.DEBUG);
        
        debugLogger.setNextDoor(infoLogProcessor);
        infoLogProcessor.setNextDoor(errorLogger);
        errorLogger.setNextDoor(fataLogger);
        // fataLogger.setNextDoor(null);
        return debugLogger;
    }
}
