package BehavioralPatterns.null_object.version1;

public class Main {
    public static void main(String[] args) {

        long x = System.currentTimeMillis();

        for (int id = 0; id < 100000; id++) {
            System.out.println("i " + id);
            Employee e = Database.findEmployeeById(id);

            if (e != null && e.isTimeToPay()) {
                e.pay();
            }
        }
    }
}
