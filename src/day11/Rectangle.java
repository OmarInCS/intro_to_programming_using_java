package day11;

public class Rectangle {
    double width;   // instance variable|field
    double length;  // instance variable|field

    // Constructor
    Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    // instance method
    double getArea() {
        return width * length;
    }
}
