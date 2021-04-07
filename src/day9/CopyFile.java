package day9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter a copy name: ");
        String copyName = sc.nextLine();


        try (PrintWriter fpr = new PrintWriter(copyName);) {
            Scanner fsc = new Scanner(new File(fileName));

            while (fsc.hasNext()) {
                fpr.println(fsc.nextLine());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
