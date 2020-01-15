package BehavioralPatterns.chainofresponsibility.ex1;

public class Main {
    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR); // 3
        AbstractLogger warningLogger = new WarningLogger(AbstractLogger.WARNING); // 2
        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO); // 1

        // building my chain of resp.
        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");
        System.out.println("----------------------------------");

        loggerChain.logMessage(AbstractLogger.WARNING,
                "This is an warning level information.");
        System.out.println("----------------------------------");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
        System.out.println("----------------------------------");
    }
}
