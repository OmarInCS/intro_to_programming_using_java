package week2.day2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        for (int i = 1; i <= 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            System.out.printf("What's %d * %d ? ", x, y);
            int answer = sc.nextInt();
            if (answer == x*y) {
                System.out.println("Correct Answer");
                score += 2;
            }
            else {
                System.out.println("Wrong Answer");
            }
            System.out.println("---------------");
        }
        System.out.println("Score: " + score + " out of 10");
    }
}
