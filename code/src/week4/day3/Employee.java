package week4.day3;

public abstract class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getAnnualSalary() {
        return salary * 12;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public abstract double getTotalSalary();

    @Override
    public String toString() {
        return "Employee: " + getName() + ", " + getSalary();
    }

}
