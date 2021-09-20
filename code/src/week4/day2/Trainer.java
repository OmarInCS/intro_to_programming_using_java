package week4.day2;

public class Trainer extends Employee {
    private int overtimeHours;

    public Trainer(String name, double salary) {
        super(name, salary);
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public double getTotalSalary() {
        return getSalary() + overtimeHours * 1.5 * getSalary() / 8 / 30;
    }
}
