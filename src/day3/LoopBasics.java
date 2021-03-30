package day3;

public class LoopBasics {
    public static void main(String[] args) {

        int x = 10;
        while (x <= 100) {
            System.out.print(x + " ");
            x += 10;
        }
        System.out.println();
        System.out.println("---------------");

        int y = 1;
        do {
            System.out.print(y + " ");
            y++;
        } while (y <= 10);
        System.out.println();
        System.out.println("---------------");

        for (int z = 10; z <= 100; z += 10) {
            System.out.print(z + " ");
        }
    }
}
