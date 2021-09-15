package week3.day3;

public class Student {
    private String name;
    private double mark;
    static int fullMark;

    public Student(String n, double m) {
        name = n;
        mark = m;
    }

    public String getName() {
        return name;
    }

    public void setMark(double value) {
        if (value >= 0) {
            mark = value;
        }
    }

    public double getPCT() {
        return mark / fullMark * 100;
    }

    public String getGrade() {
        double pct = getPCT();
        if (pct > 85) return "Excellent";
        else if (pct > 75) return "V. Good";
        else if (pct > 65) return "Good";
        else if (pct >= 50) return "Pass";
        else return "Fail";
    }
}
