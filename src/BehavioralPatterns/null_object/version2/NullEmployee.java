package BehavioralPatterns.null_object.version2;


public class NullEmployee implements IEmployee {

    public static NullEmployee emp = new NullEmployee();

    @Override
    public boolean isTimeToPay() {
        return false;
    }

    @Override
    public void pay() {
        // nothing
    }


}
