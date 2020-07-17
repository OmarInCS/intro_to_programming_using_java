package week2.day4;

import java.util.Arrays;
import java.util.Scanner;

public class AssignGrades {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #students: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a mark: ");
            marks[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(marks));

        int best = 0;
//        for (int i = 0; i < n; i++) {
//            if (marks[i] > best) {
//                best = marks[i];
//            }
//        }
        for (int m : marks) {
            if (m > best) {
                best = m;
            }
        }

        System.out.println("Best mark: " + best);

        for (int m : marks) {
            if (m > best - 10) {
                System.out.println(m + " => A");
            }
            else if (m > best - 20) {
                System.out.println(m + " => B");
            }
            else if (m > best - 30) {
                System.out.println(m + " => C");
            }
            else if (m > best - 40) {
                System.out.println(m + " => D");
            }
            else {
                System.out.println(m + " => F");
            }

        }
    }

}
