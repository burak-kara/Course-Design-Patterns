package BehavioralPatterns.memento.ex1;

public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("behavioral.state #1");
        originator.setState("behavioral.state #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("behavioral.state #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("behavioral.state #4");
        System.out.println("Current behavioral.state: " + originator.getState());

        System.out.println("=========================");

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved behavioral.state: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved behavioral.state: " + originator.getState());
    }
}
