package week3.day4;

public class Circle extends Shape {

    double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }

}
