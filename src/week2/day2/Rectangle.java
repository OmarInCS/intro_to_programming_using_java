package week2.day2;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double w, double l) {
        width = w;
        length = l;
    }

    public double getArea() {
        return width * length;
    }
}
