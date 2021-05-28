package week1.day4;

import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a new password: ");
        String password = sc.nextLine();

        if (password.length() < 8) {
            System.out.println("Weak password");
        }
        else {
            int upperCount = 0;
            int digitCount = 0;

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
                else if (Character.isUpperCase(ch)) {
                    upperCount++;
                }
            }

            if (upperCount < 2 || digitCount < 2) {
                System.out.println("Weak Password");
            }
            else {
                System.out.println("Strong Password");
            }
        }
    }
}
