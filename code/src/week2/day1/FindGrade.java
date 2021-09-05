package week2.day1;

import java.util.Scanner;

public class FindGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter std. mark: ");
        double mark = sc.nextDouble();
        System.out.print("Enter full mark: ");
        double fullMark = sc.nextDouble();

        double pct = mark / fullMark * 100;
        System.out.println("PCT: " + pct + "%");

        switch ( (int) pct / 10 * 10 ) {
            case 90:
                System.out.println("Excellent");
                break;
            case 80:
                System.out.println("V. Good");
                break;
            case 70:
                System.out.println("Good");
                break;
            case 60:
                System.out.println("Pass");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
