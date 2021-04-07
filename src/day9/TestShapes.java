package day9;


public class TestShapes {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 5, "blue");
        Circle c1 = new Circle(3, "red");
//        Shape s1 = new Shape();

        printShapeInfo(r1);
        System.out.println("--------------");
        printShapeInfo(c1);
    }

    public static void printShapeInfo(Shape sh) {
        System.out.println(sh.getClass() + ": " + sh.getColor());
        System.out.println(sh.getClass() + ": " + sh.getTimeCreated());
        System.out.println(sh.getArea());
//        if (sh instanceof Circle) {
//            System.out.println(((Circle) sh).getArea());
//        }
//        else if (sh instanceof Rectangle) {
//            System.out.println(((Rectangle) sh).getArea());
//        }
    }
}
