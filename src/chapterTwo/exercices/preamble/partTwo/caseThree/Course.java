package chapterTwo.exercices.preamble.partTwo.caseThree;

import java.util.ArrayList;

public class Course {
    private String name;
    private String classroom;
    private ArrayList<Student> students;

    public Course(String name, String classroom) {
        this.name = name;
        this.classroom = classroom;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
