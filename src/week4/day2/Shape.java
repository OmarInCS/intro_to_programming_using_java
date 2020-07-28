package week4.day2;

import java.time.LocalTime;

public abstract class Shape implements Comparable<Shape>{

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

    public abstract double getArea();

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() < o.getArea()) return -1;
        else if (this.getArea() > o.getArea()) return 1;
        else return 0;
    }
}
