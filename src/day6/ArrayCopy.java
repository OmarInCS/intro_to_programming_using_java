package day6;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] x = {10, 20, 30};
//        int[] y = x;
        int[] y = Arrays.copyOf(x, x.length);
        String[] names = {"Wael", "Ahmed", "Zaid", "Fahad"};
        int[] marks = new int[5];

//        y[1] += 3;
        changeArrayValue(x);
        Arrays.sort(names);
        Arrays.fill(marks, 25);

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.binarySearch(names, "Wael"));
        System.out.println(sum(y));
        System.out.println(sum(15, 30, 50, 12));
    }

    static void changeArrayValue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 3;
        }
    }

    static int sum(int... values) {
        int total = 0;
//        for (int i = 0; i < values.length; i++) {
//            total += values[i];
//        }
        for (int v : values) {
            total += v;
        }

        return total;
    }
}
