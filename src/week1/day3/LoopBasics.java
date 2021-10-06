package week1.day3;

public class LoopBasics {
    public static void main(String[] args) {
        int x = 10;
        while (x <= 20) {
            System.out.print(x + "\t");
            x += 2;
        }
        System.out.println();
        System.out.println("----------------------");

        int y = 10;
        do {
            System.out.print(y + "\t");
            y += 2;
        } while (y <= 20);
        System.out.println();
        System.out.println("----------------------");

        for (int z = 10; z <= 20; z += 2) {
            System.out.print(z + "\t");
        }

    }
}
