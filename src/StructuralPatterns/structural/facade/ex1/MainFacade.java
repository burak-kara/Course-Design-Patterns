package StructuralPatterns.structural.facade.ex1;

public class MainFacade {

    public static void main(String[] args) {

        CarFacade cf = new CarFacade();
        cf.runEngine();
        System.out.println();
        cf.drive();
        System.out.println();
        cf.stopEngine();
    }
}
