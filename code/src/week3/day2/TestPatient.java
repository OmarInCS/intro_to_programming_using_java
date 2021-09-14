package week3.day2;

public class TestPatient {
    public static void main(String[] args) {

        Patient p1 = new Patient("Omar", 65, 182);
        Patient p2 = new Patient("Khalid", 85, 175);

        System.out.printf("%s, %s, %f\n", p1.name, p1.getStatus(), p1.getBMI());
        System.out.printf("%s, %s, %f\n", p2.name, p2.getStatus(), p2.getBMI());


    }
}
