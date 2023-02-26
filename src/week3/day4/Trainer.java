package week3.day4;

public class Trainer extends Employee {
    private double overtime;

    public Trainer(int empId, String empName, double salary) {
        super(empId, empName, salary);
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getTotalSalary() {
        return getSalary() + overtime;
    }
}
