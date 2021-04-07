package day9;

public class Circle extends Shape {
    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return String.format("Circle: %f, %s\n", getArea(), getTimeCreated());
    }
}
