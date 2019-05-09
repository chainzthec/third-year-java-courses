package chapter2.exercises.preamble.partTwo.caseThree;

import java.util.ArrayList;

public class Student {
    private String firstname;
    private String lastname;
    private ArrayList<Course> courses;
    private ArrayList<Result> results;

    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.courses = new ArrayList<>();
        this.results = new ArrayList<>();
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    ArrayList<Course> getCourses() {
        return courses;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

}
