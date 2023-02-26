package week3.day3;

import java.util.ArrayList;

public class Department {
    private String deptName;
    private ArrayList<String> empNames;
    private ArrayList<Double> salaries;

    public Department(String deptName) {
        this.deptName = deptName;
        this.empNames = new ArrayList<>();
        this.salaries = new ArrayList<>();
    }

    public void addEmployee(String name, double salary) {
        empNames.add(name);
        salaries.add(salary);
    }

    public void dropEmployee(int idx) {
        empNames.remove(idx);
        salaries.remove(idx);
    }

    public String getDeptName() {
        return deptName;
    }

    public ArrayList<String> getEmpNames() {
        return empNames;
    }

    public ArrayList<Double> getSalaries() {
        return salaries;
    }
}
