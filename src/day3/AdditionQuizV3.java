package day3;

import java.util.Scanner;

public class AdditionQuizV3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many question? ");
        int n = sc.nextInt();

        int score = 0;

        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            System.out.printf("What's %d + %d ? ", x, y);
            int answer = sc.nextInt();

            if (answer == x+y) {
                System.out.println("Correct");
                score++;
            }
            else {
                System.out.println("Wrong");
            }

            System.out.println("---------------");
        }
        System.out.println("Your score: " + score + " out of " + n);
    }
}
