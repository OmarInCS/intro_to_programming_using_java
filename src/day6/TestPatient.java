package day6;

public class TestPatient {
    public static void main(String[] args) {
        Patient p1 = new Patient("Omar", 65, 182);
        Patient p2 = new Patient("Khalid", 75, 179);

        System.out.printf("%s: %f, %s\n", p1.name
                                        , p1.getBMI()
                                        , p1.getStatus());
        System.out.printf("%s: %f, %s\n", p2.name
                                        , p2.getBMI()
                                        , p2.getStatus());
    }
}
