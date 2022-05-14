package day12;

public class Student {
    String name;
    private double mark;
    static int fullMark;

    Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    double getMark() {
        return mark;
    }

    void setMark(double value) {
        if (value >= 0) {
            mark = value;
        }
    }

    double getPercent() {
        return mark / fullMark * 100;
    }

    String getGrade() {
        double pct = getPercent();
        if (pct > 85) return "Excellent";
        else if (pct > 75) return "V. Good";
        else if (pct > 65) return "Good";
        else if (pct >= 50) return "Pass";
        else return "Fail";
    }
}
