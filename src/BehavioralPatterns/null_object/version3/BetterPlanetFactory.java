package BehavioralPatterns.null_object.version3;

public class BetterPlanetFactory {

    public static Planet getPlanet(String name) {
        if ("Earth".equalsIgnoreCase(name))
            return new Earth();
        else if ("Mars".equalsIgnoreCase(name))
            return new Mars();
        else
            return new NullPlanet();
    }
}
