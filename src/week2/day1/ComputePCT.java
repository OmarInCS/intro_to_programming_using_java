package week2.day1;

import java.util.Scanner;

public class ComputePCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num. of students: ");
        int n = sc.nextInt();
        System.out.print("Enter exam full mark: ");
        int fullMark = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter std. mark: ");
            double mark = sc.nextDouble();
            double pct = mark / fullMark * 100;
            System.out.println("Percentage: " + pct + "%");
            if (pct >= 50) {
                System.out.println("Pass");
            }
            else {
                System.out.println("Fail");
            }
        }
    }
}
