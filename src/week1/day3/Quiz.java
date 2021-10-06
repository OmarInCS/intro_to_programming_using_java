package week1.day3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, answer;

        do {
            x = (int)(Math.random() * 10);
            y = (int)(Math.random() * 10);
            System.out.printf("What's %d * %d ? ", x, y);
            answer = sc.nextInt();
        } while (answer == x*y);
        System.out.println("Game Over!!");
    }
}
