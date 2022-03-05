package day4;

public class PasswordGeneratorHints {
    public static void main(String[] args) {
        int x = 12345;
        System.out.printf("First digit: %d\n", x % 10);
        System.out.printf("Second digit: %d\n", x % 100 / 10);
        System.out.printf("Third digit: %d\n", x % 1000 / 100);
        System.out.printf("Forth digit: %d\n", x % 10000 / 1000);
        System.out.printf("Fifth digit: %d\n", x % 100000 / 10000);
    }
}
