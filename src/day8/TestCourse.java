package day8;


public class TestCourse {

    public static void main(String[] args) {
        Course c1 = new Course("Python");
        c1.addStudent(new Student("Ahmed", 23));
        c1.addStudent(new Student("Ali", 19));
        c1.addStudent(new Student("Omar", 21));

        System.out.println(c1.getStudents());
        System.out.println(c1.getNumOfStudents());
        System.out.println("Best Std: " + c1.getBestStudent());

        c1.dropStudent("Ali");
        System.out.println(c1.getStudents());
        System.out.println(c1.getNumOfStudents());

    }
}
