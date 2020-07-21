package week3.day2;

public class Student {
    String name; // instance/object variable
    private double mark; // instance/object variable
    private static double finalMark; // static/class variable

    // Constructor
    Student(String name, double mark) {
        this.name = name;
        this.mark = mark;
        finalMark = 25;
    }

    public static double getFinalMark() {
        return finalMark;
    }

    public static void setFinalMark(double value) {
        if (value >= 5) {
            finalMark = value;
        }
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double value) {
        if (value >= 0 && value <= finalMark) {
            mark = value;
        }
    }


    double calcPercentage() {
        return mark / finalMark * 100;
    }

    String getGrade() {
        double pct = calcPercentage();
        if (pct > 85) return "Excellent";
        else if (pct > 75) return "V. Good";
        else if (pct > 65) return "Good";
        else if (pct >= 50) return "Pass";
        else return "Fail";
    }
}
