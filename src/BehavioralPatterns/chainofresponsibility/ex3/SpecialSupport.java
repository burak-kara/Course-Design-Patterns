package BehavioralPatterns.chainofresponsibility.ex3;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class SpecialSupport extends Support {
    private int number;

    public SpecialSupport(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
