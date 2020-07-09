package week1.day3;

public class TernaryOperator {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        if (x > y)
            System.out.println("x: " + x);
        else
            System.out.println("y: " + y);


        System.out.println(x > y ? "x: " + x : "y: " + y);
    }
}
