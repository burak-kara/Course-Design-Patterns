package BehavioralPatterns.template_method.version2;

public class Coffee extends Beverage {
    @Override
    protected void makeCampaign() {

    }

    @Override
    protected void chargeYourFriend() {
        System.out.println("charge your friend with 5TL");
    }

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

}