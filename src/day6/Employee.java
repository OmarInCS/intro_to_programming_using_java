package day6;

import java.time.Year;

public class Employee {
    String name;
    double salary;
    private int hireYear;

    public Employee(String n, double s, int h) {
        name = n;
        salary = s;
        hireYear = h;
    }

    public void setHireYear(int h) {
        if (h <= Year.now().getValue()) {
            hireYear = h;
        }
    }

    int getHireYear() {
        return hireYear;
    }

    double getAnnualSalary() {
        return salary * 12;
    }

    int getServicePeriod() {
        return Year.now().getValue() - hireYear;
    }
}
