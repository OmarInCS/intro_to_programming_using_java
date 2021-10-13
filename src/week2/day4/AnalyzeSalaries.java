package week2.day4;

import java.util.Scanner;

public class AnalyzeSalaries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num. of emps.: ");
        int n = sc.nextInt();

        double[] salaries = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter emp. salary: ");
            salaries[i] = sc.nextDouble();
        }

        double total = 0;
        for (double s : salaries) {
            total += s;
        }
        double avg = total / n;
        System.out.println("Average salary: " + avg);

        int count = 0;
        for (double s : salaries) {
            if (s > avg) {
                count++;
            }
        }
        System.out.println("Above Average: " + count);
    }
}
