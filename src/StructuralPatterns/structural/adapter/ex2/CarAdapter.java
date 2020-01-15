package StructuralPatterns.structural.adapter.ex2;

public class CarAdapter implements Bicycle {

    private Car c;

    public CarAdapter(Car c) {
        this.c = c;
    }

    @Override
    public void ride() {
        c.drive();
    }
}
