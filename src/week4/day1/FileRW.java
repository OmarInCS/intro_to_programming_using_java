package week4.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileRW {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mr Omar\\Desktop\\words.txt";
        String anotherFilePath = "data.csv";
        File f = new File(filePath);

        System.out.println(f.exists());
        System.out.println(f.length() / 1000);
        System.out.println(f.canRead());

        try {
            Scanner fsc = new Scanner(f);
            while (fsc.hasNext()) {
                System.out.println(fsc.nextLine());
            }


            PrintWriter fout = new PrintWriter(anotherFilePath);
            fout.println("Name,mid term, final");
            fout.println("Ahmed,23,75");
            fout.println("Wael,25,95");
            fout.println("Ziad,20,91");
            fout.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }




    }
}
