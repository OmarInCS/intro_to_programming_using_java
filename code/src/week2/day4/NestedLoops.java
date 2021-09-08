package week2.day4;

public class NestedLoops {
    public static void main(String[] args) {

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                if (y == 3 && x == 5) {
//                    break;
//                }
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                if (y == x) {
                    System.out.print("X\t");
                    continue;
                }
                System.out.print(x + "\t");
            }
            System.out.println();
        }

    }
}
