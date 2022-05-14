package day12;

public class SalesPerson extends Employee {

    double comm;

    SalesPerson(int empID, String name, double salary, double comm) {
        super(empID, name, salary);
        this.comm = comm;
    }

    double getTotalSalary() {
        return salary + comm * salary;
    }
}
