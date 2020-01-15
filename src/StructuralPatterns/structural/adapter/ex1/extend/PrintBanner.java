package StructuralPatterns.structural.adapter.ex1.extend;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    public void printWeek() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
