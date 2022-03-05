package day4;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your studentID: ");
        int id = sc.nextInt();
        int digit1 = id % 10;
        int digit2 = (id % 10000 / 1000 + id % 100000 / 10000) % 10;
        int digit3 = id % 1000 / 100;
        int digit4 = (id % 100 / 10 * 4) % 10;

        System.out.printf("Hello, %s, your password is: %d%d%d%d", name, digit4, digit3, digit2, digit1);
    }
}
