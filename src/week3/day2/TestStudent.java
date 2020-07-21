package week3.day2;

public class TestStudent {

    public static void main(String[] args) {

        Student s1 = new Student("Ahmed", 23);
        Student s2 = new Student("Abbas", 19);

//        Student.finalMark = 30;
        Student.setFinalMark(-30);
//        s1.mark = 27;
        s1.setMark(25);

        System.out.println(s1.name + " : " + s1.calcPercentage());
        System.out.println(s2.name + " : " + s2.calcPercentage());

    }

}
