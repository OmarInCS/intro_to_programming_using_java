package week2.day4;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int[] x = {10, 20, 30};
//        int[] y = x;
        int[] y = x.clone();

        y[0] += 2;

        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));

        String[] names = {"Mohamed", "Waleed", "Fahad", "Hussein"};
        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        System.out.println(Arrays.binarySearch(names, "Mohamed"));

        int[] rewards = new int[5];
        Arrays.fill(rewards, 500);
        System.out.println(Arrays.toString(rewards));

        String ip = "192.168.5.15";
        String[] octas = ip.split("\\.");
        System.out.println(Arrays.toString(octas));

        String text = "Welcome to Java, Java is Fun";
        String[] words = text.split(" ");
        System.out.println(Arrays.toString(words));

        String word = "Welcome";
        char[] letters = word.toCharArray();
        System.out.println(Arrays.toString(letters));

    }
}
