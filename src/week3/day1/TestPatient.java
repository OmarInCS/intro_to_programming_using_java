package week3.day1;

public class TestPatient {
    public static void main(String[] args) {

        Patient p1 = new Patient("Omar", 65, 182);
        Patient p2 = new Patient("Khalid", 85, 175);
//        Patient p3 = p2;
        Patient p3 = new Patient(p2);

        p2.weight += 10;

        System.out.printf("%s, %s, %.2f\n", p1.name, p1.getStatus(), p1.getBMI());
        System.out.printf("%s, %s, %.2f\n", p2.name, p2.getStatus(), p2.getBMI());
        System.out.printf("%s, %s, %.2f\n", p3.name, p3.getStatus(), p3.getBMI());

    }
}
