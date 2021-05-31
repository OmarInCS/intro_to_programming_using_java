package week2.day2;

public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient("Omar", 65, 182);
        Patient p2 = new Patient("Faisal", 81, 174);

        System.out.printf("%s, %2.2f, %s\n", p1.name, p1.getBMI(), p1.getStatus());
        System.out.printf("%s, %2.2f, %s\n", p2.name, p2.getBMI(), p2.getStatus());
    }
}
