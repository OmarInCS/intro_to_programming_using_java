package week3.day4;

import java.util.ArrayList;

public class Course {

    private String courseTitle;
    private double price;
    private ArrayList<String> students;

    public Course(String title, double price) {
        this.courseTitle = title;
        this.price = price;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name) {
        this.students.add(name);
    }

    public void dropStudent(String name) {
        this.students.remove(name);
    }

    public ArrayList<String> getStudents() {
        return this.students;
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }

}
