package day12;

public class Trainer extends Employee {

    double overtime;

    Trainer(int empID, String name, double salary) {
        super(empID, name, salary);
    }

    double getTotalSalary() {
        return salary + overtime;
    }
}
