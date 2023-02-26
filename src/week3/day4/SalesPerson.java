package week3.day4;

public class SalesPerson extends Employee {
    private double comm;

    public SalesPerson(int empId, String empName, double salary, double comm) {
        super(empId, empName, salary);
        this.comm = comm;
    }

    public double getComm() {
        return comm;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public double getTotalSalary() {
        return getSalary() + getSalary() * comm;
    }
}
