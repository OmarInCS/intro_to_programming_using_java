package week4.day1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintMarksToFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file name: ");
        String fileName = sc.nextLine();

        try {
            PrintWriter fout = new PrintWriter(fileName);
            for (int i = 0; i < 5; i++) {
                int x = (int)(Math.random() * 25);
                fout.println(x);
            }

            fout.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
