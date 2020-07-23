package week3.day4;

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
    double getArea() {
        return this.width * this.length;
    }


}
