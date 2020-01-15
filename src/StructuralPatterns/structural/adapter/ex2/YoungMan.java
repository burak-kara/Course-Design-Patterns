package StructuralPatterns.structural.adapter.ex2;

public class YoungMan {

    private Bicycle b;

    public YoungMan(Bicycle b) {
        this.b = b;
    }

    public void ride() {
        b.ride();
    }
}
