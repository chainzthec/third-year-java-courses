package chapter2.exercices.exercice2;

import java.util.ArrayList;

public class Student {

    private String firstname;
    private String lastname;
    private ArrayList<Mark> marks;

    Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    void addMark(Mark mark){
        marks.add(mark);
    }

    public Mark getMark(int id){
        return marks.get(id);
    }

    public void removeMark(Mark mark){
        marks.remove(mark);
    }

    public void removeMark(int id){
        marks.remove(id);
    }

    public ArrayList<Mark> getMarks() {
        return marks;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
