package week1.day1;

import java.util.Scanner;

public class ComputeSalary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter the tax: ");
        double tax = sc.nextDouble();
        double annualSalary = salary * 12 - tax;
        System.out.println("Annual Salary: " + annualSalary);
    }
}
