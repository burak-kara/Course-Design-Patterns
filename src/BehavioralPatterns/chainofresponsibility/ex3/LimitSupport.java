package BehavioralPatterns.chainofresponsibility.ex3;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        return trouble.getNumber() < limit;
    }
}
