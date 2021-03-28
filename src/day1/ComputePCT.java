package day1;

import java.util.Scanner;

public class ComputePCT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        double mark = sc.nextDouble();

        System.out.print("Enter the full mark: ");
        double fullMark = sc.nextDouble();

        double pct = mark / fullMark * 100;

        System.out.println("PCT: " + pct);
    }
}
