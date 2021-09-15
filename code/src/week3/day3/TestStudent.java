package week3.day3;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Omar", 23);
        Student s2 = new Student("Khalid", 20);

        Student.fullMark = 30;
//        s2.mark = -25;
        s2.setMark(25);

        System.out.printf("%s, %s, %.2f\n", s1.getName(), s1.getGrade(), s1.getPCT());
        System.out.printf("%s, %s, %.2f\n", s2.getName(), s2.getGrade(), s2.getPCT());

    }
}
