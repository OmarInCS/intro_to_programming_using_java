package week1.day3;

import java.util.Scanner;

public class MultiQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        System.out.printf("What's %d * %d ? ", x, y);
        int answer = sc.nextInt();

        if (answer == x*y) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
        }
    }
}
