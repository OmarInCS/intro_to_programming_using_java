package day8;

import java.util.ArrayList;

public class Course {
    private String title;
    private ArrayList<Student> students;

    public Course(String title) {
        this.title = title;
        students = new ArrayList<>();
    }

    public void addStudent(Student st) {

        students.add(st);
    }

    public void dropStudent(String name) {
        for (Student st : students) {
            if (st.name.equals(name)) {
                students.remove(st);
                return;
            }
        }
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public int getNumOfStudents() {
        return students.size();
    }

    public String getTitle() {
        return title;
    }

    public Student getBestStudent() {
        Student bestStd = null;
        double bestMark = 0;
        for (Student st : students) {
            if (st.mark > bestMark) {
                bestMark = st.mark;
                bestStd = st;
            }
        }

        return bestStd;
    }

}
