package CreationalPatterns.singleton.version4;

public class MainForTriple {
    public static void main(String[] args) {
        Triple t1 = Triple.getInstance(0);
        Triple t2 = Triple.getInstance(1);
        Triple t3 = Triple.getInstance(2);
        Triple t4 = Triple.getInstance(2);
        System.out.println(t1.getId());
        System.out.println(t2.getId());
        System.out.println(t3.getId());
        System.out.println(t4.getId());

        if (t3 == t4)
            System.out.println("we are same");
    }
}
