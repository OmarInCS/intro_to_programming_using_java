package day1;

import java.util.Scanner;

public class ComputeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        int annualSalary = salary * 12;
        System.out.println("Annual Salary is: " + annualSalary + " SAR");
    }
}
