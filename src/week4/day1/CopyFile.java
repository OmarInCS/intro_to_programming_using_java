package week4.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = sc.nextLine();

        File f = new File(fileName);
        try {
            Scanner fsc = new Scanner(f);
            PrintWriter fout = new PrintWriter(fileName.replace(".", "_copy."));

            while (fsc.hasNext()) {
                fout.println(fsc.nextLine());
            }

            fout.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Program End");
    }
}
