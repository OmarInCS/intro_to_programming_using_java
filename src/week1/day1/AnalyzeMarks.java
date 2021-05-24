package week1.day1;

import java.util.Scanner;

public class AnalyzeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three marks: ");
        double m1 = sc.nextDouble();
        double m2 = sc.nextDouble();
        double m3 = sc.nextDouble();

        double best = Math.max(Math.max(m1, m2), m3);
        double lowest = Math.min(Math.min(m1, m2), m3);
        double avg = Math.round((m1 + m2 + m3) / 3);

//        System.out.println("Best: " + best);
//        System.out.println("Lowest: " + lowest);
        System.out.printf("Average: (%2.2f) " , avg);

//        System.out.println("Best: " + best + ", Lowest: " + lowest + ", Average: " + avg);
        System.out.printf("Best: %2.2f, Lowest: %2.2f, Average: %2.2f", best, lowest, avg);
    }
}
