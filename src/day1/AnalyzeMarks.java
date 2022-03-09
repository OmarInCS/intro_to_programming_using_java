package day1;

import java.util.Scanner;

public class AnalyzeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        double avg = (m1 + m2 + m3) / 3.0;
        System.out.println("Average: " + Math.round(avg));
        System.out.println("Best: " + Math.max(Math.max(m1, m2), m3));
        System.out.println("Worst: " + Math.min(Math.min(m1, m2), m3));
    }
}
