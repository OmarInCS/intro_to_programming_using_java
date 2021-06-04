package week2.day4;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListBasics {
    public static void main(String[] args) {
//        double[] marks = {19, 23, 17, 25};
        ArrayList<Double> marks = new ArrayList();
        marks.add(19.0);
        marks.add(23.0);
        marks.add(17.0);
        marks.add(25.0);

        System.out.println(marks);
        System.out.println(marks.get(1));
        System.out.println(marks.contains(17.0));

        marks.add(0, 20.0);
        System.out.println(marks);

        marks.remove(20.0);
        System.out.println(marks);

        Collections.sort(marks);
        Collections.reverse(marks);
        System.out.println(marks);

        System.out.println(Collections.max(marks));
        System.out.println(Collections.min(marks));
        System.out.println(marks.size());

        double total = 0;
        for (Double m : marks) {
            total += m;
        }
        System.out.println(total / marks.size());
    }
}
