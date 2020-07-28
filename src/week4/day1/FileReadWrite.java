package week4.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReadWrite {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\OmarKarem\\Desktop\\data.txt");
        System.out.println(file.exists());

        try (PrintWriter pr = new PrintWriter(file);) {

            pr.println(23 + " " + 22);
            pr.println(13 + " " + 23);
            pr.println(15 + " " + 23);

//            pr.close();
        }
        catch (FileNotFoundException ex){
            System.out.println("The file path is wrong");
        }

        // ------------------------------------

        File wordsFile = new File("C:\\Users\\OmarKarem\\Desktop\\words.txt");

        try (Scanner sc = new Scanner(wordsFile);) {

            ArrayList<String> words = new ArrayList<>();

            while (sc.hasNext()) {
                String word = sc.nextLine();
                words.add(word);
            }

            int idx = (int)(Math.random() * words.size());
            System.out.println(words.get(idx));

        } catch (FileNotFoundException e) {
            System.out.println("The file is missing");
        }


    }

}
