package day12;

public class Employee {
    int empID;
    String empName;
    double salary;

    Employee(int empID, String name, double salary) {
        this.empID = empID;
        this.empName = name;
        this.salary = salary;
    }

    double getAnnualSalary() {
        return salary * 12;
    }

}
