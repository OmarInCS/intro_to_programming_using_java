package week2.day1;

import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = (int) (Math.random() * 100);
        System.out.print("Guess number btw 0-100: ");
        int guess = sc.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.print("Guess Smaller number: ");
            }
            else {
                System.out.print("Guess Greater number: ");
            }
            guess = sc.nextInt();
        }
        System.out.println("You Guess Right!!");
    }

}
