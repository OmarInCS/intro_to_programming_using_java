package day9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
//            System.out.println("Result: " + x / y);
            double result = divide(x, y);
            System.out.println("Result: " + result);
        }
//        catch (ArithmeticException ex) {
//            System.out.println("second number cannot be zero");
//        }
//        catch (InputMismatchException ex) {
//            System.out.println("number must be int");
//        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("Recheck your inputs");
        }
        System.out.println("--- Good Bye ---");

    }

    public static double divide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return (double) x / y;
    }
}
