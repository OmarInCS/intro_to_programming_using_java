package week2.day3;

import java.util.Scanner;

public class CallMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your mark: ");
//        double m = sc.nextDouble();
//        System.out.print("Enter exam final mark: ");
//        int fm = sc.nextInt();
//
//        double pct = MyMethods.getPercentage(m, fm);
//        String grade = MyMethods.getGrade(pct);
//
//        System.out.printf("Your percentage: %f, and grade: %s", pct, grade);

        String plate = "xyz1234";
        System.out.println(MyMethods.isPlateValid(plate));
    }




}
