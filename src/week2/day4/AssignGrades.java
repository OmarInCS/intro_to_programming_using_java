package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num. of std.: ");
        int n = sc.nextInt();

        ArrayList<Double> marks = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter std. mark: ");
            double m = sc.nextDouble();
            marks.add(m);
        }

        double best = Collections.max(marks);
        Collections.sort(marks);
        Collections.reverse(marks);

        for (Double m : marks) {
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
