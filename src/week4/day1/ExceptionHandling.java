package week4.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Result: " + x / y);
        }
//        catch (ArithmeticException ex) {
//            System.out.println("Cannot divide by zero");
//        }
//        catch (InputMismatchException ex) {
//            System.out.println("Input should be integers");
//        }
        catch (Exception ex) {
            System.out.println("recheck your input");
            System.out.println(ex.getMessage());
        }
        System.out.println("--- Good Bye ---");
    }
}
