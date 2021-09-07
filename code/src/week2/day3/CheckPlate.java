package week2.day3;

import java.util.Scanner;

public class CheckPlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a plate number: ");
        String plate = sc.nextLine();

        if (plate.length() < 4 || plate.length() > 7) {
            System.out.println("Invalid Plate Number!!");
        }
        else {
            String part1 = plate.substring(0, 3);
            String part2 = plate.substring(3);

            int letterCount = 0;
            int digitCount = 0;

            for (int i = 0; i < part1.length(); i++) {
                char ch = part1.charAt(i);
                if (Character.isLetter(ch)) {
                    letterCount++;
                }
            }

            for (int i = 0; i < part2.length(); i++) {
                char ch = part2.charAt(i);
                if (Character.isDigit(ch)) {
                    digitCount++;
                }
            }

            if (letterCount != part1.length() || digitCount != part2.length()) {
                System.out.println("Invalid Plate Number!!");
            }
            else {
                System.out.println("Valid Plate Number!!");
            }
        }
    }
}
