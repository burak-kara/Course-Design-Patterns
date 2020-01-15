package StructuralPatterns.structural.adapter.ex1.extend;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        Banner b = new PrintBanner("World!");

        p.printWeek();
        p.printStrong();

        System.out.println("-----");


        b.showWithAster();
        b.showWithParen();


    }
}
