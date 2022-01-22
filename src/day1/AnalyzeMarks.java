package day1;

import java.util.Scanner;

public class AnalyzeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three marks: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double avg = (m1 + m2 + m3) / 3;

        System.out.println("Average Mark: " + Math.round(avg * 100) / 100.0);
        System.out.println("Best Mark: " + Math.max(Math.max(m1, m2), m3));
        System.out.println("Worst Mark: " + Math.min(Math.min(m1, m2), m3));
    }
}
