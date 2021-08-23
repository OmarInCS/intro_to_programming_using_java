package week1.day2;

import java.util.Scanner;

public class ComputePCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        double mark = sc.nextDouble();
        System.out.print("Enter exam full mark: ");
        int fullMark = sc.nextInt();
        double pct = mark / fullMark * 100;

        System.out.println("Your Score: " + pct + "%");
    }
}
