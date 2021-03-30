package day3;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = (int)(Math.random() * 100);

        System.out.print("Guess a number btw 0-100: ");
        int guess = sc.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.print("Go Down\n>> ");
            }
            else {
                System.out.print("Go Up\n>> ");
            }
            guess = sc.nextInt();
        }
        System.out.println("You Guess Right!");
    }
}
