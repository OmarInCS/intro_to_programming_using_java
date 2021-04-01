package day5;

import java.util.Scanner;

public class AssignGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of std: ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a mark: ");
            marks[i] = sc.nextDouble();
        }

        double best = getBest(marks);

        for (int i = 0; i < n; i++) {
            char grade = getGrade(marks[i], best);
            System.out.println(marks[i] + " => " + grade);
        }
    }

    static double getBest(double[] marks) {
        double best = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > best) {
                best = marks[i];
            }
        }

        return best;
    }

    static char getGrade(double mark, double best) {
        if (mark >= best - 10) return 'A';
        else if (mark >= best - 20) return 'B';
        else if (mark >= best - 30) return 'C';
        else if (mark >= best - 40) return 'D';
        else return 'F';
    }
}
