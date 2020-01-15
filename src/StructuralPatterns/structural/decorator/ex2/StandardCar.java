package StructuralPatterns.structural.decorator.ex2;

public class StandardCar implements Car {
    @Override
    public void build() {
        System.out.println("Standard Car");
    }
}
