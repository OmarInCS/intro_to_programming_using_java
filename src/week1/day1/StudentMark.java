package week1.day1;


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
    }
}
