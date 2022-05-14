package day12;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("Khalid", 23);
        Student s2 = new Student("Belal", 19);

        Student.fullMark = 30;
//        s2.mark = -21;
        s2.setMark(-23);
//        System.out.println(s2.getMark());
        System.out.printf("%s %.2f %s\n", s1.name, s1.getPercent(), s1.getGrade());
        System.out.printf("%s %.2f %s\n", s2.name, s2.getPercent(), s2.getGrade());
    }
}
