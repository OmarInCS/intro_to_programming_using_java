package week3.day1;

public class TestPatient {

    public static void main(String[] args) {

        Patient p1 = new Patient(65, 1.82);
        System.out.println("BMI is: " + p1.getBMI());
        System.out.println("Status is: " + p1.getStatus());

    }

}
