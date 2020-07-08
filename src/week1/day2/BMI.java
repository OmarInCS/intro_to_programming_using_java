package week1.day2;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.println("BMI is: " + Math.round(bmi));
    }
}
