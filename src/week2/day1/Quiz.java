package week2.day1;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many question? ");
        int n = sc.nextInt();

        int score = 0;
        for (int i = 0; i < n; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            System.out.printf("What's %d * %d ? ", x, y);
            int answer = sc.nextInt();
            if (answer == x*y) {
                System.out.println("Correct Answer");
                score++;
            }
            else {
                System.out.println("Wrong Answer");
            }
            System.out.println("---------------");
        }
        System.out.println("Your score: " + score + " out of " + n);
    }
}
