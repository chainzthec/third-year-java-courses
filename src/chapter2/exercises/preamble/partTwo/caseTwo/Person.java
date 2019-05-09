package chapter2.exercises.preamble.partTwo.caseTwo;

import java.util.ArrayList;

public class Person {
    private String firstname;
    private String lastname;
    private ArrayList<Person> parents = new ArrayList<>(2);

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public ArrayList<Person> getParents() {
        return parents;
    }

    public void setParents(ArrayList<Person> parents) {
        this.parents = parents;
    }
}
