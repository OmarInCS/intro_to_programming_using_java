package week2.day5;

import java.util.ArrayList;

public class Course {
    private String title;
    private double price;
    private ArrayList<String> students;

    public Course(String t, double p) {
        title = t;
        price = p;
        students = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void addStudent(String name) {
        students.add(name);
    }

    public void dropStudent(String name) {
        students.remove(name);
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumOfStudents() {
        return students.size();
    }

    public double getTotalIncome() {
        return price * getNumOfStudents();
    }
}
