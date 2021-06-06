package week3.day1;

public class TestShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "red");
        Circle c1 = new Circle(3, "blue");

//        r1.printDetails();
//        c1.printDetails();
//        printDetails(r1);
//        printDetails(c1);
        System.out.println(r1);
        System.out.println(c1);
    }

    public static void printDetails(Shape s) {
        System.out.println(s.getClass());
        System.out.println(s.timeCreated);
        System.out.println(s.color);
        if (s instanceof Rectangle) {
            System.out.println(((Rectangle) s).getArea());
        }
        else if (s instanceof Circle) {
            System.out.println(((Circle) s).getArea());
        }
        System.out.println("--------------------");
    }
}
