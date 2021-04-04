package day6;


public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmed", 8888, 2015);
//        e1.hireYear = 2025;
        e1.setHireYear(2011);
        System.out.printf("%s, Annual Salary: %f, Service Period: %d"
                        , e1.name, e1.getAnnualSalary(), e1.getServicePeriod());
    }
}
