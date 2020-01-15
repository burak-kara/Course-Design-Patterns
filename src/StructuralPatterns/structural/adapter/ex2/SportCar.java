package StructuralPatterns.structural.adapter.ex2;

public class SportCar implements Car {
    @Override
    public void drive() {
        System.out.println("I'm driving a sport car, yuppiii!!!!!");
    }
}
