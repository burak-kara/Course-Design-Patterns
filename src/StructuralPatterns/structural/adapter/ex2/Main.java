package StructuralPatterns.structural.adapter.ex2;

public class Main {
    public static void main(String[] args) {
        Car c = new SportCar();
        Bicycle b = new MyBike();

        YoungMan ym = new YoungMan(b);
        ym.ride();
        System.out.println("-------");

        CarAdapter ca = new CarAdapter(c);
        YoungMan ym2 = new YoungMan(ca);
        ym2.ride();

        System.out.println("=====================");

        Car c2 = new SportCar();
        Bicycle b2 = new MyBike();
        b2.ride();
        MyBike mb = new MyBike();
        mb.oop();

        Bicycle ca2 = new CarAdapter(c2);
        ca2.ride();
        System.out.println("before the assignment!!");
        b2 = ca2;
        b2.ride();

    }
}
