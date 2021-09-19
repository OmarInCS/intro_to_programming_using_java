package week4.day1;

import java.util.ArrayList;

public class Course {
    private String title;
    private double price;
    private ArrayList<String> students;

    public Course(String title, double price) {
        this.title = title;
        this.price = price;
        this.students = new ArrayList<>();
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

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalProfit() {
        return price * getNumOfStudents();
    }
}
