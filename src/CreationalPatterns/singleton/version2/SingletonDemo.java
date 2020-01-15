package CreationalPatterns.singleton.version2;

public class SingletonDemo {
    private static SingletonDemo ourInstance = new SingletonDemo();

    private SingletonDemo() {
        System.out.println("SingletonDemo is initialized");
    }

    public static SingletonDemo getInstance() {
        return ourInstance;
    }

    public void printText(String input) {
        System.out.println(("input is " + input));
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println("SingletonDemo");
        var x = SingletonDemo.getInstance();
        var y = SingletonDemo.getInstance();
        if (x == y)
            System.out.println("x and y are same object");
        x.printText("XYZ");
    }
}
