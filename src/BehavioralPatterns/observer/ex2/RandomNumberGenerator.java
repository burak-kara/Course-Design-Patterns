package BehavioralPatterns.observer.ex2;

import java.util.Random;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = random.nextInt(10);
            notifyObservers();
        }
    }


}
