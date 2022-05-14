package day12;

public class EmployeeTest {

    public static void main(String[] args) {
        Trainer t1 = new Trainer(101, "Ahmed", 10000);
        SalesPerson s1 = new SalesPerson(102, "Ali", 10000, 0.2);

        t1.overtime = 1000;

        System.out.printf("%s %.2f %.2f\n", t1.empName, t1.getTotalSalary(), t1.getAnnualSalary());
        System.out.printf("%s %.2f %.2f\n", s1.empName, s1.getTotalSalary(), s1.getAnnualSalary());

    }
}
