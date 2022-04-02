package day9;

import java.util.Arrays;

public class ArraysCopy {
    public static void main(String[] args) {
        int[] x = {10, 20, 30};
//        int[] y = x;
        int[] y = Arrays.copyOf(x, x.length);

        y[0] += 3;

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        int[] z = {15, 25, 27, 13, 10};
        Arrays.sort(z);
        System.out.println(Arrays.toString(z));
        System.out.println(Arrays.binarySearch(z, 15));
        System.out.println(Arrays.binarySearch(z, 17));
        Arrays.fill(z, 30);
        System.out.println(Arrays.toString(z));
    }
}
