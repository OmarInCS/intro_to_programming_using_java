package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListBasics {
    public static void main(String[] args) {
//        int[] marks = new int[5];
//        marks[0] = 23;
//        marks[1] = 19;
//
//        System.out.println(Arrays.toString(marks));
        ArrayList<String> names = new ArrayList<>();
        names.add("Ahmed");
        names.add("Wael");
        names.add("Ali");

        System.out.println(names);

        names.add(0, "Omar");
        System.out.println(names);

        System.out.println(names.get(3));
        System.out.println(names.size());
        System.out.println(names.contains("Wael"));

//        names.remove(0);
        names.remove("Omar");
        System.out.println(names);

        ArrayList<Double> marks = new ArrayList<>();
        marks.add(23.0);
        marks.add(19.0);
        marks.add(20.0);

        System.out.println(marks);
    }
}
