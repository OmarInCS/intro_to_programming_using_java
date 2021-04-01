package day4;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak Password");
        }
        else {

            int digitCount = 0;
            int upperCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isDigit(ch)) {
                    digitCount++; // line 4
                }
                else if (Character.isUpperCase(ch)) {
                    upperCount++; // line 7
                }
            }

            if (digitCount < 2 || upperCount < 2) {
                System.out.println("Weak Password");
            }
            else {
                System.out.println("Strong Password");
            }
        }
    }
}
