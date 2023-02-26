package week3.day4;

public class TestEmployee {
    public static void main(String[] args) {
        Trainer t1 = new Trainer(101, "Ali", 7000);
        SalesPerson s1 = new SalesPerson(102, "Wael", 5000, 0.05);

        t1.setOvertime(500);

        printEmpDetails(t1);
        printEmpDetails(s1);
    }

    public static void printEmpDetails(Employee e) {
        System.out.printf("%s,%.0f,%.0f\n", e.getEmpName(), e.getTotalSalary(), e.getAnnualSalary());
    }
}
