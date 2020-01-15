package BehavioralPatterns.memento.ex2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sasakiumi on 3/2/14.
 */
public class Memento {
    protected int money;
    private ArrayList<String> fruits;

    public Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    public List<String> getFruits() {
        return new ArrayList<>(fruits);
    }
}
