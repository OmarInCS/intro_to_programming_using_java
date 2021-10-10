package week2.day1;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int)(Math.random() * 100);
        System.out.print("Enter a num. btw. 0-100: ");
        int guess = sc.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.println("Go down ");
            }
            else {
                System.out.println("Go up ");
            }
            guess = sc.nextInt();
        }
        System.out.println("You Guessed Right!!");
    }
}
