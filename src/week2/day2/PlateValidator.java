package week2.day2;

import java.util.Scanner;

public class PlateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plate number: ");
        String plate = sc.nextLine();

        if (plate.length() < 4 || plate.length() > 7) {
            System.out.println("Invalid Plate Number");
        }
        else {
            String part1 = plate.substring(0, 3);
            String part2 = plate.substring(3);

            for (int i = 0; i < part1.length(); i++) {
                char ch = part1.charAt(i);
                if (!Character.isLetter(ch)) {
                    System.out.println("Invalid Plate Number");
                    System.exit(0);
                }
            }

            for (int i = 0; i < part2.length(); i++) {
                char ch = part2.charAt(i);
                if (!Character.isDigit(ch)) {
                    System.out.println("Invalid Plate Number");
                    System.exit(0);
                }
            }

            System.out.println("Valid Plate Number");
        }
    }
}
