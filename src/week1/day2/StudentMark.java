package week1.day2;


import java.util.Scanner;

public class StudentMark {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student mark: ");
        double mark = sc.nextDouble();

        System.out.print("Enter exam final mark: ");
        int finalMark = sc.nextInt();

        double pct = mark / finalMark * 100;

        System.out.println("Percentage: " + Math.round(pct));

        if (pct > 85) {
            System.out.println("Excellent");
        }
        else if (pct > 75) {
            System.out.println("V. Good");
        }
        else if (pct > 65) {
            System.out.println("Good");
        }
        else if (pct >= 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }


    }
}
