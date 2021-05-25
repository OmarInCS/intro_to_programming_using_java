package week1.day2;

import java.util.Scanner;

public class DayChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the day number: ");
        int day = sc.nextInt();

//        if (day >= 1 && day <= 5) {
//            System.out.println("Work-day");
//        }
//        else if (day == 6 || day == 7) {
//            System.out.println("Weekend");
//        }
//        else {
//            System.out.println("Invalid day number!!");
//        }

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week-day");
                break;
            case 6:
            case 7:
                System.out.println("Week-end");
                break;
            default:
                System.out.println("Invalid day number!!");
        }
    }
}
