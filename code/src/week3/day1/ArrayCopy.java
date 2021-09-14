package week3.day1;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] x = {10, 20, 30};
//        int[] y = x;
        int[] y = Arrays.copyOf(x, x.length);

        y[0] += 3;

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}
