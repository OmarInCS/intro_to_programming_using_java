package week4.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleExceptions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Result: " + x / y);
        }
        catch (Exception ex) {
            System.out.println("Recheck your input");
        }

//        catch (ArithmeticException ex) {
//            System.out.println("second number can't be zero");
//        } catch (InputMismatchException ex) {
//            System.out.println("Enter two integer numbers");
//        }
        System.out.println("---- End ----");

    }

}
