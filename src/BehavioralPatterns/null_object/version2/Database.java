package BehavioralPatterns.null_object.version2;

public class Database {
    public static IEmployee findEmployeeById(int id) {
        if (id == 1234) {
            return new Employee("John");
        } else {
            // NOTE: You can use the singleton pattern here
            // E.g. NullEmployee.getInstance()
            return NullEmployee.emp; //new NullEmployee();
        }
    }
}
