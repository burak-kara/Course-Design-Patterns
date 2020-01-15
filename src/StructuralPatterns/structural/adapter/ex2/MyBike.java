package StructuralPatterns.structural.adapter.ex2;

public class MyBike implements Bicycle {
    @Override
    public void ride() {
        System.out.println("I'm riding my bike!");
    }

    public void oop() {
        System.out.println("this is the beauty of OOP");
    }
}
