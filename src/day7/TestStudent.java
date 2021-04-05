package day7;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student("Omar", 19);
        Student s2 = new Student("Khaled", 23);
        Student s3 = new Student("Wael", 25);

        Student.fullMark = 30;
//        s1.fullMark = 30;
//        Student.count = 15;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("$students: " + Student.getCount());
    }
}
