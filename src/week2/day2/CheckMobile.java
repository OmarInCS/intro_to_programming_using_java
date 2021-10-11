package week2.day2;

import java.util.Scanner;

public class CheckMobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a mobile number: ");
        String mobile = sc.nextLine();

        if (mobile.length() != 10 || !mobile.startsWith("05")) {
            System.out.println("Invalid mobile number");
        }
        else {
            int digitCount = 0;

            for (int i = 0; i < mobile.length(); i++) {
                char ch = mobile.charAt(i);
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            if (digitCount != 10) {
                System.out.println("Invalid mobile number");
            }
            else {
                System.out.println("Valid mobile number");
            }
        }
    }
}
