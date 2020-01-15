package BehavioralPatterns.template_method.version2;

public class Sahlep extends Beverage {
    @Override
    protected void makeCampaign() {

    }

    @Override
    protected void chargeYourFriend() {
        System.out.println("charging 10TL");
    }

    @Override
    void brew() {
        System.out.println("Brewing Sahlep core ...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and cinnamon");

    }


}
