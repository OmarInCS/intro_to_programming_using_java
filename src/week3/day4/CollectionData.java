package week3.day4;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionData {

    public static void main(String[] args) {
//        int[] marks = new int[5];
//        marks[0] = 23;
//        marks[1] = 25;
//        System.out.println(Arrays.toString(marks));

        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(23);
        marks.add(25);

        System.out.println(marks);
        marks.add(19);
        marks.add(1, 20);
//        marks.add(10, 13);

        System.out.println(marks);

        marks.remove(1);
        System.out.println(marks);

        marks.set(2, 29);
        System.out.println(marks);

        System.out.println(marks.get(1));

        System.out.println(marks.size());

    }


}
