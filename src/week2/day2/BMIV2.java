package week2.day2;

import java.util.Scanner;

public class BMIV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and height: ");
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            double bmi = weight / (height * height);
            System.out.println("BMI is: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Underweight");
            }
            else if (bmi < 25) {
                System.out.println("Normal");
            }
            else if (bmi < 30) {
                System.out.println("Overweight");
            }
            else {
                System.out.println("Obese");
            }
        }
    }
}
