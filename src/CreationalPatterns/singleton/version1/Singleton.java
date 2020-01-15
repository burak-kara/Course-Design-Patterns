package CreationalPatterns.singleton.version1;

public class Singleton {
    private static Singleton singleton = null; //new singleton();

    private Singleton() {
        System.out.println("Make instance");
    }

    public static Singleton getInstance() {

        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}
