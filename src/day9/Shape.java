package day9;

import java.time.LocalTime;

public abstract class Shape implements Comparable<Shape> {
    private String color;
    private LocalTime timeCreated;

    public Shape(String color) {
        this.color = color;
        this.timeCreated = LocalTime.now();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public LocalTime getTimeCreated() {
        return timeCreated;
    }

    public abstract double getArea();

    @Override
    public int compareTo(Shape o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        }
        else if (this.getArea() == o.getArea()) {
            return 0;
        }
        else {
            return -1;
        }
    }
}
