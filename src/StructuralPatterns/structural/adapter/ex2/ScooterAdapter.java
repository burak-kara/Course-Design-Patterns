package StructuralPatterns.structural.adapter.ex2;

public class ScooterAdapter implements Car {
    private Scooter s;

    public ScooterAdapter(Scooter s) {
        this.s = s;
    }

    @Override
    public void drive() {
        s.flyMeToTheMoon();
    }
}
