package StructuralPatterns.structural.facade.ex1;

public class FuelInjector {

    public void on() {
        System.out.println("Fuel injection is on");
    }

    public void off() {
        System.out.println("Fuel injection is off");
    }

    public void injectFuel(int fuel) {
        System.out.println("Injecting fuel of " + fuel);
    }
}
