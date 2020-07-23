package week3.day4;

public class TestCourse {

    public static void main(String[] args) {

        Course c1 = new Course("Java", 1000);
        c1.addStudent("Omar");
        c1.addStudent("Saud");
        c1.addStudent("Abu Helah");
        c1.addStudent("Salem");

        System.out.println(c1.getStudents());

        c1.dropStudent("Omar");
        System.out.println(c1.getNumberOfStudents());
        System.out.println(c1.getStudents());
    }


}
