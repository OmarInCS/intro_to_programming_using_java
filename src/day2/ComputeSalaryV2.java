package day2;

import java.util.Scanner;

public class ComputeSalaryV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary);

        if (salary > 12000) {
            System.out.println("High Salary");
        }
        else if (salary > 6000) {
            System.out.println("Normal Salary");
        }
        else if (salary > 3000) {
            System.out.println("Low Salary");
        }
        else {
            System.out.println("Very Low Salary");
        }

    }
}
