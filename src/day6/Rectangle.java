package day6;

public class Rectangle {
    double width;
    double length;

    Rectangle() {

    }

    Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    double getArea() {
        return width * length;
    }
}
