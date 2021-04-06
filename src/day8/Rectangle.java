package day8;

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

    double getArea() {
        return width * length;
    }
}
