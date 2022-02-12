package day3;

public class LoopBasics {
    public static void main(String[] args) {

        int x = 100;
        while (x >= 10) {
            System.out.print(x + "\t");
            x -= 10;
        }
        System.out.println();
        System.out.println("------------");

        int y = 11;
        do {
            System.out.print(y + "\t");
            y++;
        } while (y <= 10);
        System.out.println();
        System.out.println("------------");

        for (int z = 10; z <= 100; z += 10) {
            System.out.print(z + "\t");
        }

    }
}
