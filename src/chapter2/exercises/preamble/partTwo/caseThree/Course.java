package chapter2.exercises.preamble.partTwo.caseThree;

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

    public void addStudent(Student student1) {
        student1.getCourses().add(this);
        students.add(student1);
    }

    public void giveMark(Student student1, Result result) {
        student1.getResults().add(result);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNom de la classe : ").append(name).append("\nSalle de classe : ").append(classroom).append("\nÉlèves participant à cette classe : ");
        int i = 0;
        for (Student student : students) {
            sb.append("\nPrénom de l'étudiant ").append(i).append(" : ").append(student.getFirstname());
            sb.append("\nNom de l'étudiant ").append(i).append(" : ").append(student.getLastname());
            i++;
        }
        return sb.toString();
    }
}
