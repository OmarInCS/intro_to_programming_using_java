package week3.day2;

public class Student {
    String name;
    private double mark;
    static int fullMark = 25;

    public Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double newValue) {
        if (newValue >= 0) {
            mark = newValue;
        }
    }


    public double calcPercentage() {
        return mark / fullMark * 100;
    }

    public String findGrade() {
        double pct = calcPercentage();
        if (pct > 85) {
            return "Excellent";
        }
        else if (pct > 75) {
            return "V. Good";
        }
        else if (pct > 65) {
            return "Good";
        }
        else if (pct >= 50) {
            return "Pass";
        }
        else {
            return "Fail";
        }
    }
}
