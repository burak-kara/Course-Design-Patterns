package StructuralPatterns.structural.adapter.ex1.delegate;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeek();
        p.printStrong();
    }
}
