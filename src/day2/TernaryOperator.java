package day2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student percent: ");
        double pct = sc.nextDouble();

//        if (pct >= 50) {
//            System.out.println("Pass");
//        }
//        else {
//            System.out.println("Fail");
//        }

        System.out.println(pct >= 50 ? "Pass" : "Fail");

    }
}
