package day4;

public class NestedLoops {
    public static void main(String[] args) {

        // break, continue

//        for (int y = 1; y <= 10; y++) {
//            for (int x = 1; x <= 10; x++) {
//                System.out.print(x + "\t");
//            }
//            System.out.println();
//        }

        for (int y = 1; y <= 10; y++) { // line 1
            for (int x = 1; x <= 10; x++) { // line 2
                if (x == 5 && y == 3) { // line 3
                    break; // line 4
                } // line 5
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        for (int y = 1; y <= 10; y++) { // line 1
            for (int x = 1; x <= 10; x++) { // line 2
                if (x == y) { // line 3
                    System.out.print("X\t"); // line 4
                    // line 5
                } // line 6
                System.out.print(x + "\t"); // line 7
            } // line 8
            System.out.println(); // line 9
        } // line 10
    }
}
