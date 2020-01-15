package BehavioralPatterns.template_method.version2;

public class Barista {
    public static void main(String[] args) {
        Beverage hc = new HotChocolate();
        hc.prepareRecipe("hot chocolate");
    }
}