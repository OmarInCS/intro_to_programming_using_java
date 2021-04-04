package day6;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.println("Enter width and length: ");
        r1.width = sc.nextDouble();
        r1.length = sc.nextDouble();

        Rectangle r2 = new Rectangle(3, 7);
//        r2.width = 3;
//        r2.length = 7;

        System.out.println("Area: " + r1.getArea());
        System.out.println("Area: " + r2.getArea());
    }
}
