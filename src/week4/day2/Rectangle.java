package week4.day2;

import java.util.Objects;

public class Rectangle extends Shape {

    double width;
    double length;

    // Constructor
    Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    // Operations
    public double getArea() {
        return this.width * this.length;
    }


    public String toString() {
        return "width: " + width + ", length: " + length;
    }

    public boolean equals(Object o) {
        return this.getArea() == ((Rectangle) o).getArea();
    }

}
