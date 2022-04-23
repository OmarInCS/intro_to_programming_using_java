package day11;

public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient("Omar", 72, 182);
        Patient p2 = new Patient("Belal", 80, 175);
        Patient p3 = new Patient("Khalid");
//        Patient p4 = new Patient();

        System.out.printf("%s,%s,%.2f\n", p1.name, p1.getStatus(), p1.getBMI());
        System.out.printf("%s,%s,%.2f\n", p2.name, p2.getStatus(), p2.getBMI());
        System.out.printf("%s,%s,%.2f\n", p3.name, p3.getStatus(), p3.getBMI());
//        System.out.printf("%s,%s,%.2f\n", p4.name, p4.getStatus(), p4.getBMI());
    }
}
