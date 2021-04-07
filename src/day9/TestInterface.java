package day9;

import java.util.Arrays;

public class TestInterface {
    public static void main(String[] args) {
        String[] names = {"Zaid", "Obaid", "Abaas", "Fernas"};
        Integer[] marks = {23, 10, 15, 21};
        Shape[] shapes = {
                new Circle(3, "red"),
                new Circle(5, "red"),
                new Rectangle(5, 4, "red"),
                new Rectangle(10, 4, "red")
        };

        Arrays.sort(names);
        Arrays.sort(marks);
        Arrays.sort(shapes);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));
        System.out.println(Arrays.toString(shapes));
    }
}
