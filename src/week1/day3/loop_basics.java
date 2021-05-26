package week1.day3;

public class loop_basics {
    public static void main(String[] args) {

        int x = 10;
        while (x <= 100) {
            System.out.print(x + " ");
            x += 10;
        }
        System.out.println();
        System.out.println("------------");

        for (int y = 10; y <= 100; y += 10) {
            System.out.print(y + " ");
        }
        System.out.println();
        System.out.println("------------");
    }
}
