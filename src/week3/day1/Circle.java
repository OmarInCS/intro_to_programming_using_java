package week3.day1;

public class Circle extends Shape {
    public double radius;

    public Circle(double r, String c) {
        super(c);
        radius = r;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
