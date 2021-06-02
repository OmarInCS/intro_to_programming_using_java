package week2.day3;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Omar", 23);
        Student s2 = new Student("Fahad", 19);
//        Student s3 = s2;
        Student s3 = new Student(s2);

        System.out.printf("%s, %s, %2.2f%%\n", s1.name, s1.getGrade(), s1.getPercent());
        System.out.printf("%s, %s, %2.2f%%\n", s2.name, s2.getGrade(), s2.getPercent());
        System.out.printf("%s, %s, %2.2f%%\n", s3.name, s3.getGrade(), s3.getPercent());

//        s2.mark = -21;
        s2.setMark(25);
//        Student.fullMark = 30;

        System.out.printf("%s, %s, %2.2f%%\n", s1.name, s1.getGrade(), s1.getPercent());
        System.out.printf("%s, %s, %2.2f%%\n", s2.name, s2.getGrade(), s2.getPercent());
        System.out.printf("%s, %s, %2.2f%%\n", s3.name, s3.getGrade(), s3.getPercent());
    }
}
