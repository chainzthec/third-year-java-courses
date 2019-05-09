package chapter2.exercises.preamble.partTwo.caseOne;

public class Employee {
    private String firstname;
    private String lastname;
    private Service service;

    public Employee(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public Service getService() {
        return service;
    }

    void setService(Service service) {
        this.service = service;
    }
}