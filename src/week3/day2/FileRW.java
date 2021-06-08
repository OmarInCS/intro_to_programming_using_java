package week3.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRW {

    static int x;
    static int y;

    public static void main(String[] args) {

//        try {
//            PrintWriter pr1 = new PrintWriter("quiz.txt");
//            PrintWriter pr2 = new PrintWriter("model-answers.txt");
//            for (int i = 1; i <= 5; i++) {
//                String q = generateQuestion();
//                pr1.println(i + "- " + q + " = .........");
//                pr2.println(x * y);
//            }
//
//            pr1.close();
//            pr2.close();
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        }

//        try {
//            Scanner sc1 = new Scanner(new File("omar.txt"));
//            Scanner sc2 = new Scanner(new File("model-answers.txt"));
//            int score = 0;
//            while (sc2.hasNext()) {
//                int correctAnswer = sc2.nextInt();
//                int omarAnswer = sc1.nextInt();
//                if (omarAnswer == correctAnswer) {
//                    score++;
//                }
//            }
//
//            System.out.println("Student score: " + score);
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println(ex);
//        }

        try {
            Scanner sc = new Scanner(new File("omar.txt"));
            int total = 0;
            int count = 0;
            while (sc.hasNext()) {
                total += sc.nextInt();
                count++;
            }

            System.out.println("Average: " + (double) total / count);
        }
        catch (FileNotFoundException ex) {

        }
    }

    public static String generateQuestion() {
        x = (int) (Math.random() * 10);
        y = (int) (Math.random() * 10);

        return String.format("What's %d * %d ? ", x, y);
    }
}
