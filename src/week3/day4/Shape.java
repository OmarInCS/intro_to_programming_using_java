package week3.day4;

import java.time.LocalTime;

public class Shape {

    String color;
    LocalTime timeCreated;

    public Shape(String color) {
        this.color = color;
        this.timeCreated = LocalTime.now();
    }

    public void printDetails() {
        System.out.println(this.getClass());
        System.out.println(this.color);
        System.out.println(this.timeCreated);
        if (this instanceof Circle) {
            System.out.println(((Circle) this).getArea());
        }
        else if (this instanceof Rectangle) {
            System.out.println(((Rectangle) this).getArea());
        }
        System.out.println("-".repeat(20));
    }

}
