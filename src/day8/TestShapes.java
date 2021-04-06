package day8;

public class TestShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "blue");
        Circle c1 = new Circle(3, "red");

        System.out.println("Circle: " + c1.getArea());
        System.out.println("Circle: " + c1.getTimeCreated());
        System.out.println(c1);
        System.out.println("--------------");
        System.out.println("Rectangle: " + r1.getArea());
        System.out.println("Rectangle: " + r1.getTimeCreated());
    }
}
