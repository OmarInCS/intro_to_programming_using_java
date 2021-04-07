package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TextIO {
    public static void main(String[] args) {
//        String path = "C:\\Users\\Mr Omar\\Desktop\\Group20210305\\week4\\day1\\words.txt";
        String path = "words.txt";
        File f = new File(path);
        System.out.println(f.exists());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.canRead());
        System.out.println(Arrays.toString(f.listFiles()));
        System.out.println("------------");
        try {
            Scanner sc = new Scanner(f);
            ArrayList<String> words = new ArrayList<>();
            while (sc.hasNext()) {
//                System.out.println(sc.nextLine());
                words.add(sc.nextLine());
            }
            int idx = (int) (Math.random() * words.size());
            System.out.println(words.get(idx));
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("-------------");
        PrintWriter pr = null;
        try {
            pr = new PrintWriter("grades.csv");
            pr.printf("Omar, %.2f, %.2f\n", Math.random() * 25, Math.random() * 25);
            pr.printf("Ahmed, %.2f, %.2f\n", Math.random() * 25, Math.random() * 25);
            pr.printf("Ali, %.2f, %.2f\n", Math.random() * 25, Math.random() * 25);
            pr.printf("Yasser, %.2f, %.2f\n", Math.random() * 25, Math.random() * 25);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            pr.close();
        }

    }
}
