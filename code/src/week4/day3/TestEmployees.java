package week4.day3;

public class TestEmployees {
    public static void main(String[] args) {
        Trainer t1 = new Trainer("Ahmed", 7000);
        SalesPerson s1 = new SalesPerson("Khalid", 4000, 0.02);
//        Employee e1 = new Employee("Ali", 10000);

        t1.setOvertimeHours(10);
        s1.setTotalSales(50000);

        printEmployeeDetails(t1);
        printEmployeeDetails(s1);

    }

    public static void printEmployeeDetails(Employee e) {
        System.out.println(e);
//        System.out.println(e.getName());
//        System.out.println(e.getSalary());
        System.out.println(e.getAnnualSalary());

//        if (e instanceof Trainer) {
//            System.out.println(((Trainer) e).getTotalSalary());
//        }
//        else if (e instanceof SalesPerson) {
//            System.out.println(((SalesPerson) e).getTotalSalary());
//        }

//        System.out.println(e.toString());
        System.out.println(e.getTotalSalary());
        System.out.println("---------------------");
    }
}
