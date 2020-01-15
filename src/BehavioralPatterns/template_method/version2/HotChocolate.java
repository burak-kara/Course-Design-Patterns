package BehavioralPatterns.template_method.version2;

public class HotChocolate extends Beverage {
    @Override
    protected void makeCampaign() {
        System.out.println("campaign");
    }

    @Override
    void chargeYourFriend() {
        System.out.println("10TL");
    }

    @Override
    void brew() {
        System.out.println("hot chocolate");
    }

    @Override
    void addCondiments() {
        System.out.println("cream");
    }
}
