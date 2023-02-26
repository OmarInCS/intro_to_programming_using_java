package week3.day2;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Omar", 24);
        Student s2 = new Student("Wael", 21);

        Student.fullMark = 30;
//        s2.mark = -25;
        s2.setMark(30);

        System.out.printf("%s, %s, %.2f\n", s1.name, s1.findGrade(), s1.calcPercentage());
        System.out.printf("%s, %s, %.2f\n", s2.name, s2.findGrade(), s2.calcPercentage());

    }
}
