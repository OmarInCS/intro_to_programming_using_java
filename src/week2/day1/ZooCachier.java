package week2.day1;

import java.util.Scanner;

public class ZooCachier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a person age (or exit): ");
        String info = sc.nextLine();
        int total = 0;

        while (!info.equals("exit")) {
            int age = Integer.parseInt(info);
            if (age > 50) {
                total += 8;
            }
            else if (age > 20) {
                total += 15;
            }
            else if (age > 2) {
                total += 10;
            }
            System.out.print("Enter a person age (or exit): ");
            info = sc.nextLine();
        }
        System.out.println("Total invoice is: " + total + " SAR");
    }
}
