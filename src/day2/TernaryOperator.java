package day2;

public class TernaryOperator {
    public static void main(String[] args) {

        // OmarInCS@gmail.com

        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);
        System.out.println("The two numbers: " + x + ", " + y);
//        if (x > y) {
//            System.out.println("The max is: " + x);
//        }
//        else {
//            System.out.println("The max is: " + y);
//        }

        System.out.println("The max is: " + (x > y ? x : y));
    }
}
