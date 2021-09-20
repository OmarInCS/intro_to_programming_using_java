package week4.day2;

public class SalesPerson extends Employee {
    private double comm;
    private double totalSales;

    public SalesPerson(String name, double salary, double comm) {
        super(name, salary);
        this.comm = comm;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getTotalSalary() {
        return getSalary() + comm * totalSales;
    }
}
