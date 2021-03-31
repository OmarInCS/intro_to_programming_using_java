package day4;

public class PrimePrinter {
    public static void main(String[] args) {

        int number = 2;
        int printCount = 0;

        while (printCount < 50) {
            boolean isPrime = true;
            for (int div = 2; div < number; div++) {
                if (number % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + "\t");
                printCount++;
                if (printCount % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }

    }
}
