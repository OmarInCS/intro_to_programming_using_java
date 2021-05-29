package week1.day5;

public class NestedLoops {
    public static void main(String[] args) {
        // break, continue
//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                if (x == 5 && y == 2) {
//                    break;
//                }
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                if (x == 5 && y == 2) {
//                    System.out.print("X" + "\t");
//                    continue;
//                }
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

        for (int y = 1; y <= 10; y++) {
            for (int x = 1; x <= 10; x++) {
                if (x == y) {
                    System.out.print("X" + "\t");
                    continue;
                }
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
