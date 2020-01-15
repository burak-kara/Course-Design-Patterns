package BehavioralPatterns.template_method.version1;

public class Sahlep {

    void prepareRecipe() {
        boilWater();
        brewSahlepGrinds();
        pourInCup();
        addSugar();
        addCinnemon();
    }

    public void boilWater() {
        System.out.println("Boiling water and milk");
    }

    public void brewSahlepGrinds() {
        System.out.println("Add Sahlep core");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public void addSugar() {
        System.out.println("Adding Sugar");
    }

    public void addCinnemon() {
        System.out.println("Tarcining....");
    }
}
