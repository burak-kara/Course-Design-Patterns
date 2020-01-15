package BehavioralPatterns.template_method.version2;

public abstract class Beverage {

    public final void prepareRecipe(String type) {

        boil(type);
        brew();
        pourInCup();
        addCondiments();
        drink();
        clean();
        deliver();
        makeCampaign();
        chargeYourFriend();
        
    }

    protected abstract void makeCampaign();

    private void deliver() {
        System.out.println("Deliver hot beverage to the address...");
    }

    abstract void chargeYourFriend();

    void clean() {
        System.out.println("Cleaning the cups...");
    }

    void drink() {
        System.out.println("Drinking...");
    }

    abstract void brew();

    abstract void addCondiments();

    void boil(String type) {
        System.out.println("Boiling " + type);
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}