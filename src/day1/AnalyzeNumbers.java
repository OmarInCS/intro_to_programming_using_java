package day1;

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three marks: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double best = Math.max(Math.max(m1, m2), m3);
        double worst = Math.min(Math.min(m1, m2), m3);
        double avg = (m1 + m2 + m3) / 3;
        avg = Math.round(avg * 100) / 100.0;

        System.out.println("Best: " + best);
        System.out.println("Worst: " + worst);
        System.out.println("Average: " + avg);

    }
}
