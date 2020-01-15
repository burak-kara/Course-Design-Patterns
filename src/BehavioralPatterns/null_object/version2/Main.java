package BehavioralPatterns.null_object.version2;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 100000; i++) {
            IEmployee e = Database.findEmployeeById(i);
            //IEmployee e2 = Database.findEmployeeById(i * 2);

            if (e.isTimeToPay() ) {
                e.pay();
            }

           // IEmployee e4 = Database.findEmployeeById(i * 2);
           // e4.pay();
        }
    }
}
