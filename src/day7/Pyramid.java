package day7;

public class Pyramid {
    public static void main(String[] args) {

        for (int y = 1; y <= 5; y++) {
            for (int s = 1; s <= 5 - y; s++) {
                System.out.print(" ");
            }

            for (int x = 1; x <= y; x++) {
                System.out.print("* ");
            }

            for (int s = 1; s <= 5 - y; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
