package week1.day1;

import java.util.Scanner;

public class AnalyzeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double avg = Math.round((m1 + m2 + m3) / 3);
        double best = Math.max(Math.max(m1, m2), m3);
        double worst = Math.min(Math.min(m1, m2), m3);

        System.out.println("Average: " + avg);
        System.out.println("Best: " + best);
        System.out.println("Worst: " + worst);
    }
}
