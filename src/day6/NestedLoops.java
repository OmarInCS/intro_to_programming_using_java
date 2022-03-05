package day6;

public class NestedLoops {
    public static void main(String[] args) {
        // break, continue
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break;
//            }
//            System.out.print(i + "\t");
//        }
//        System.out.println();
//
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                continue;
//            }
//            System.out.print(i + "\t");
//        }
//

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= y; x++) {
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

        for (int y = 1; y <= 10; y++) {
            for (int x = 10; x >= y; x--) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

    }
}
