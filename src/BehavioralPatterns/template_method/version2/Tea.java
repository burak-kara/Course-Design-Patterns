package BehavioralPatterns.template_method.version2;

public class Tea extends Beverage {
    @Override
    protected void makeCampaign() {

    }

    @Override
    protected void chargeYourFriend() {
        System.out.println("0 TL ikram :)");
    }

    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
        System.out.println("Adding Sugar as free of charge");
    }
}