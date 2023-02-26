package week3.day2;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Omar");
        students.add("Ali");
        students.add("Wael");

        System.out.println(students);

//        students.remove("Ali");
        students.remove(1);
        System.out.println(students);

        students.add(0, "Ali");
        System.out.println(students);

        System.out.println(students.get(2));
        System.out.println(students.size());

        ArrayList<Double> marks = new ArrayList<>();
        marks.add(23.0);
        marks.add(25.0);
        marks.add(19.0);

        System.out.println(marks);
    }
}
