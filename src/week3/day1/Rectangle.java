package week3.day1;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle(double w, double l, String c) {
        super(c);
        width = w;
        length = l;
    }

    public double getArea() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                '}';
    }
}
