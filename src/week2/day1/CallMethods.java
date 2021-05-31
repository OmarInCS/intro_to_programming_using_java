package week2.day1;

import java.util.Scanner;

public class CallMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight and height: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double bmi = MyMethods.getBMI(w, h);
        String status = MyMethods.getStatus(bmi);

        System.out.printf("BMI: %2.2f, Status: %s", bmi, status);

    }
}
