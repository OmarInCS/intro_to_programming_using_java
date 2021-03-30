package day3;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many student? ");
        int std = sc.nextInt();
        System.out.print("Enter the full mark: ");
        int fullMark = sc.nextInt();

        int passCount = 0;

        for (int i = 0; i < std; i++) {
            System.out.print("Enter std mark: ");
            double mark = sc.nextDouble();
            double pct = mark / fullMark * 100;
            System.out.println("PCT: " + pct);
            if (pct >= 50) {
                System.out.println("Pass");
                passCount++;
            } else {
                System.out.println("Fail");
            }
            System.out.println("----------------");
        }
        System.out.println("#pass students: " + passCount);
    }
}
