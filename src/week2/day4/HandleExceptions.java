package week2.day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Result: " + (x / y));
        }
//        catch (InputMismatchException ex) {
//            System.out.println("input should be integer");
//        }
//        catch (ArithmeticException ex) {
//            System.out.println("second input cannot be zero");
//        }
        catch (Exception ex) {
            System.out.println("recheck your input");
        }
        System.out.println("Good Bye");

    }
}
