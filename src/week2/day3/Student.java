package week2.day3;

public class Student {
    String name;
    private double mark;
    static int fullMark = 25;

    public Student(String n, double m) {
        name = n;
        mark = m;
    }

    public Student(Student s) {
        name = s.name;
        mark = s.mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double value) {
        if (value >= 0) {
            mark = value;
        }
    }

    public double getPercent() {
        return mark / fullMark * 100;
    }

    public String getGrade() {
        double pct = getPercent();
        if (pct > 85) return "Excellent";
        else if (pct > 75) return "V. Good";
        else if (pct > 65) return "Good";
        else if (pct >= 50) return "Pass";
        else return "Fail";
    }
}
