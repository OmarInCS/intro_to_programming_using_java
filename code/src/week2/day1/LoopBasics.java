package week2.day1;

public class LoopBasics {
    public static void main(String[] args) {

        int x = 11;
        while (x <= 20) {
            System.out.print(x + " ");
            x += 2;
        }
        System.out.println();
        System.out.println("----------------");

        for (int y = 10; y <= 100; y += 10) {
            System.out.print(y + " ");
        }

    }
}
