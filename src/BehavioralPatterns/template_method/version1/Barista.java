package BehavioralPatterns.template_method.version1;

public class Barista {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Making tea....");
        tea.prepareRecipe();
        System.out.println("Making coffee....");
        coffee.prepareRecipe();

        System.out.println("Prepare Sahlep...");
        Sahlep s = new Sahlep();
        s.prepareRecipe();
    }
}