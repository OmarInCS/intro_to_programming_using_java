package week4.day1;

public class TestCourse {
    public static void main(String[] args) {
        Course c1 = new Course("Python", 1200);
        c1.addStudent("Ahmed");
        c1.addStudent("Yasser");
        c1.addStudent("Wael");

        System.out.println(c1.getNumOfStudents());
        System.out.println(c1.getStudents());

        c1.dropStudent("Yasser");
        System.out.println(c1.getStudents());
        System.out.println(c1.getNumOfStudents());
        System.out.println(c1.getTotalProfit());
    }
}
