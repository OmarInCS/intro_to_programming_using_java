package day10;

import java.util.Arrays;
import java.util.Scanner;

public class CallMethods {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter weight and height: ");
//        double w = sc.nextDouble();
//        double h = sc.nextDouble();
//        double bmi = MyMethods.getBMI(w, h);
////        String status = MyMethods.getStatus(bmi);
////        System.out.println(status + ", " + bmi);
//        MyMethods.printStatus(bmi);

        double[] marks = {23, 12, 25, 17, 13};
        System.out.println(MyMethods.max(marks));
        System.out.println(MyMethods.max(23, 12, 25, 17, 13));
        System.out.println(Arrays.toString(MyMethods.maxThreeMarks(marks)));
    }
}
