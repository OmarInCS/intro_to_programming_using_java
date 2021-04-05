package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Omar");
        names.add("Ahmed");
        names.add("Ali");
        System.out.println(names);
        names.add(1, "Wael");
        System.out.println(names);
//        names.remove("Ahmed");
//        System.out.println(names);
        names.remove(2);
        System.out.println(names);

        System.out.println(names.get(0));
        System.out.println(names.size());
        names.set(2, "Aly");
        System.out.println(names);

        ArrayList<Double> marks = new ArrayList<>();
        marks.add(23.0);
        marks.add(19.0);
        marks.add(21.0);
        marks.add(13.0);
        System.out.println(marks);
        Collections.sort(marks);
        System.out.println(marks);
        Collections.fill(marks, 25.0);
        System.out.println(marks);

    }
}
