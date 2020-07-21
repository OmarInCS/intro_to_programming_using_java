package week3.day1;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width and length: ");
        double w = sc.nextDouble();
        double l = sc.nextDouble();

        Rectangle r1 = new Rectangle(w, l);
        System.out.println("Area is: " + r1.getArea());

        Rectangle r2 = new Rectangle(3, 7);
        System.out.println("Area is: " + r2.getArea());

    }

}
