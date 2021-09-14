package week3.day1;

import java.util.Arrays;
import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of std.: ");
        int n = sc.nextInt();
        double[] marks = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter std. mark: ");
            marks[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(marks));

        double best = 0;
        for (int i = 0; i < n; i++) {
            if (marks[i] > best) {
                best = marks[i];
            }
        }

        System.out.println("Best mark: " + best);

        for (double m : marks) {
            if (m >= best - 10) {
                System.out.println(m + " => A");
            }
            else if (m >= best - 20) {
                System.out.println(m + " => B");
            }
            else if (m >= best - 30) {
                System.out.println(m + " => C");
            }
            else if (m >= best - 40) {
                System.out.println(m + " => D");
            }
            else {
                System.out.println(m + " => F");
            }
        }
    }
}
