package day7;

import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<String> students;

    public Course(String title) {
        this.title = title;
        students = new ArrayList<>();
    }

    public void addStudent(String name) {
        students.add(name);
    }

    public void dropStudent(String name) {
        students.remove(name);
    }

    public ArrayList<String> getStudents(){
        return students;
    }

    public int getNumOfStudents() {
        return students.size();
    }

    public String getTitle() {
        return title;
    }


}
