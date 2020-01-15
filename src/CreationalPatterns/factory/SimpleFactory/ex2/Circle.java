package CreationalPatterns.factory.SimpleFactory.ex2;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }

    public void foo() {
        System.out.println("foo");
    }
}
