package BehavioralPatterns.null_object.version3;

public class Main {

    public static void main(String[] args) {
        Planet p1 = PlanetFactory.getPlanet("Earth");
        Planet p2 = PlanetFactory.getPlanet("Mars");
        Planet p3 = PlanetFactory.getPlanet("Jupiter");

        if (p1 != null) {
            p1.printName();
            p1.rotate();
        }
        if (p2 != null) {
            p2.printName();
            p2.rotate();
        }
        if (p3 != null) {
            p3.printName();
            p3.rotate();
        }

        System.out.println("----------------------------------------");

        Planet p11 = BetterPlanetFactory.getPlanet("Earth");
        Planet p22 = BetterPlanetFactory.getPlanet("Mars");
        Planet p33 = BetterPlanetFactory.getPlanet("Jupiter");

        p11.printName();
        p11.rotate();
        p22.printName();
        p22.rotate();
        p33.printName();
        p33.rotate();

    }
}
