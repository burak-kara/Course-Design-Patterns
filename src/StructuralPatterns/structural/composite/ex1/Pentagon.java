package StructuralPatterns.structural.composite.ex1;

public class Pentagon implements Shape {
    private String col = "black (default)";


    @Override
    public void draw(String color) {
        System.out.println("Pentagon color " + color);
    }

    @Override
    public void drawDifferentColor() {
        System.out.println("Pentagon color " + col);
    }

    @Override
    public void setColor(String color) {
        col = color;
    }
}
