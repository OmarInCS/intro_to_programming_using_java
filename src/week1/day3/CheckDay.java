package week1.day3;

import java.util.Scanner;

public class CheckDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day number: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Work-day");
                break;
            case 6:
            case 7:
                System.out.println("Off-day");
                break;
            default:
                System.out.println("Invalid number");
        }

    }
}
