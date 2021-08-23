package week1.day2;


import java.util.Scanner;

public class ComputeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary + " SAR");
    }
}
