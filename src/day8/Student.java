package day8;

public class Student {
    String name;
    double mark;
    static int fullMark = 25;
    private static int count = 0;

    Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
        count++;
    }

    Student(Student s) {
        this.name = s.name;
        this.mark = s.mark;
        count++;
    }

    double getPercentage() {
        return mark / fullMark * 100;
    }

    String getGrade() {
        double pct = getPercentage();
        if (pct > 85) return "Excellent";
        else if (pct > 75) return "V. Good";
        else if (pct > 65) return "Good";
        else if (pct >= 50) return "Pass";
        else return "Fail";
    }

    public String toString() {

        return String.format("Student{%s: %s, %.2f}", name, getGrade(), getPercentage());
    }

    public static int getCount() {
        return count;
    }
}
