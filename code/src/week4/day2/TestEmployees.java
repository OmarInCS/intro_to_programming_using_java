package week4.day2;

public class TestEmployees {
    public static void main(String[] args) {
        Trainer t1 = new Trainer("Ahmed", 7000);
        SalesPerson s1 = new SalesPerson("Khalid", 4000, 0.02);

        System.out.println(t1.getAnnualSalary());
        System.out.println(s1.getAnnualSalary());

        t1.setOvertimeHours(10);
        s1.setTotalSales(50000);

        System.out.println(t1.getTotalSalary());
        System.out.println(s1.getTotalSalary());
    }
}
