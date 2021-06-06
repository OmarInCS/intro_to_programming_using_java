package week3.day1;

import java.time.LocalTime;

public class Shape {
    public String color;
    public LocalTime timeCreated;

    public Shape(String c) {
        color = c;
        timeCreated = LocalTime.now();
    }

    public void printDetails() {
        System.out.println(getClass());
        System.out.println(timeCreated);
        System.out.println(color);
        System.out.println("--------------------");
    }
}
