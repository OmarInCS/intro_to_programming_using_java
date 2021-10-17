package week3.day1;

public class Rectangle {
    double width;
    double length;

    Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    double getArea() {
        return width * length;
    }
}
