package BehavioralPatterns.memento.ex1;

@SuppressWarnings("unused")

public class Originator {
    private String state;
    private int id;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
