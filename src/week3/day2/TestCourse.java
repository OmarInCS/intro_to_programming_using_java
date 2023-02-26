package week3.day2;

public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Java");
        c1.addStudent("Saud");
        c1.addStudent("Munirah");
        c1.addStudent("Belal");

        System.out.println(c1.getStudents());

        c1.dropStudent("Belal");
        System.out.println(c1.getStudents());
    }
}
