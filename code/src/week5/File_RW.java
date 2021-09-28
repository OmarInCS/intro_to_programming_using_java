package week5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File_RW {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mr Omar\\Desktop\\words.txt";
        String filePath2 = "C:\\Users\\Mr Omar\\Desktop\\message.txt";
        File file = new File(filePath);
        System.out.println(file.exists());
        System.out.println(file.length());

        try (Scanner fsc = new Scanner(file);
             Scanner fsc2 = new Scanner(new File(filePath2));
             PrintWriter fout = new PrintWriter("words.txt");) {
            String ext = fsc2.nextLine();

            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                fout.println(line + ":" + ext);
            }

        }
        catch (FileNotFoundException ex) {
            System.out.println("file not found");
        }

    }
}
