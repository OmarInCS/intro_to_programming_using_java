package day9;

public class Rectangle extends Shape {
    double width;
    double length;

//    Rectangle() {
//
//    }

    Rectangle(double w, double l, String color) {
        super(color);
        width = w;
        length = l;
    }

    public double getArea() {
        return width * length;
    }

    public String toString() {
        return String.format("Rectangle: %f, %s\n", getArea(), getTimeCreated());
    }

}
