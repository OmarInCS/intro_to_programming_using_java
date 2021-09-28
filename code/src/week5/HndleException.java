package week5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HndleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two number: ");

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Result: " + x / y);
        }
//        catch (ArithmeticException ex) {
//            System.out.println("cannot divide by zero");
//        }
//        catch (InputMismatchException ex) {
//            System.out.println("enter integer numbers");
//        }
        catch (Exception ex) {
            System.out.println("Recheck your input");
        }
        System.out.println("--- Good Bye ---");

    }
}
