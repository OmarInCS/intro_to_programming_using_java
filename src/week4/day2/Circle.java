package week4.day2;

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
