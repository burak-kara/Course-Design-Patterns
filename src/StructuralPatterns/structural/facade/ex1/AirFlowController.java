package StructuralPatterns.structural.facade.ex1;

public class AirFlowController {

    public void on() {
        System.out.println("Air Flow Controller is on");
    }

    public void off() {
        System.out.println("Air flow is off");
    }

    public void takeAir(int air) {
        System.out.println("Taking in air of " + air);
    }
}
