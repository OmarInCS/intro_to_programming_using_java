package week1.day2;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

//        if (number % 2 == 0) {
//            System.out.println("Even");
//        }
//        else {
//            System.out.println("Odd");
//        }

        System.out.println(number % 2 == 0 ? "Even" : "Odd");
    }
}
