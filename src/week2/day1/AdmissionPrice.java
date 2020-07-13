package week2.day1;

import java.util.Scanner;

public class AdmissionPrice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        System.out.print("Enter age of person ('e' to exit): ");
        String info = sc.nextLine();

        while (!info.equals("e")) {
            int age = Integer.parseInt(info);

            if (age >= 3 && age <= 14) {
                total += 14;
            }
            else if (age >= 15 && age <= 65) {
                total += 23;
            }
            else if (age > 65) {
                total += 18;
            }
            System.out.print("Enter age of person ('e' to exit): ");
            info = sc.nextLine();
        }

        System.out.println("Total Cost is: " + total);
    }
}
