package BehavioralPatterns.chainofresponsibility.ex1;

public class InfoLogger extends AbstractLogger {

    InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO " + message);
    }
}

