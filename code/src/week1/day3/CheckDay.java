package week1.day3;

import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number: ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Work-day");
        }
        else if (day == 6 || day == 7) {
            System.out.println("Off-day");
        }
        else {
            System.out.println("Invalid day number!!");
        }
    }
}
