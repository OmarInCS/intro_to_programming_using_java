package week4.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFiles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        System.out.print("Enter the file copy name: ");
        String copyName = sc.nextLine();

        try (Scanner fsc = new Scanner(new File(fileName)); PrintWriter pr = new PrintWriter(copyName)) {

            while (fsc.hasNext()) {
                String line = fsc.nextLine();
                lines.add(line);
            }

            for (String line : lines) {
                pr.println(line);
            }

        }
        catch (FileNotFoundException ex) {
            System.out.println("No such file");
        }

    }

}
