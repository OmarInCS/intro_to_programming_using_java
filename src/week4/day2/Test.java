package week4.day2;

import java.util.Arrays;

public class Test {


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "red");
        Rectangle r2 = new Rectangle(4, 5, "red");
        Circle c1 = new Circle(5, "blue");

        String[] names = {"Waleed", "Belal", "Ahmed", "Khaled"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        Shape[] shapes = {r1, c1, r2};
        Arrays.sort(shapes);
        System.out.println(Arrays.toString(shapes));

        System.out.println(r1);
        System.out.println(r1.equals(r2));
//        System.out.println(r1.getArea() == r2.getArea());
//        printShapeDetails(r1);
//        printShapeDetails(c1);
    }

    public static void printShapeDetails(Shape sh) {
        System.out.println(sh.color);
        System.out.println(sh.timeCreated);
        System.out.println(sh.getArea());
        if (sh instanceof Rectangle) {
            System.out.println(((Rectangle) sh).length);
            System.out.println(((Rectangle) sh).width);
//            System.out.println(((Rectangle) sh).getArea());
        }
        else if (sh instanceof Circle) {
            System.out.println(((Circle) sh).radius);
//            System.out.println(((Circle) sh).getArea());
        }
        System.out.println("-".repeat(20));
    }

}
