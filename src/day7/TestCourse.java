package day7;

public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Python");
        c1.addStudent("Ahmed");
        c1.addStudent("Ali");
        c1.addStudent("Omar");

        System.out.println(c1.getStudents());
        System.out.println(c1.getNumOfStudents());

        c1.dropStudent("Ali");
        System.out.println(c1.getStudents());
        System.out.println(c1.getNumOfStudents());

    }
}
