package week3.day3;

public class TestDepartment {
    public static void main(String[] args) {
        Department d1 = new Department("Training");
        d1.addEmployee("Ahmed", 7000);
        d1.addEmployee("Fahad", 6500);
        d1.addEmployee("Yasser", 10000);

        System.out.println(d1.getEmpNames());
        System.out.println(d1.getSalaries());

        d1.dropEmployee(1);

        System.out.println(d1.getEmpNames());
        System.out.println(d1.getSalaries());

    }
}
