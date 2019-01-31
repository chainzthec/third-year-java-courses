package thirdCourse;

import java.util.ArrayList;

public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private double salary;
    private ArrayList<Project> projects;

    public Employee(String firstname, String lastname, int salary) {
        this.id = this.id + 1;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLastname() {
        return lastname;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Firstname : " + firstname + " Lastname : " + lastname + "Salary : " + salary;
    }
}
