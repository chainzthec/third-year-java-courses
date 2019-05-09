package chapter2.exercises.preamble.partTwo.caseOne;

import java.util.ArrayList;

public class Service {
    private String name;
    private ArrayList<Employee> employees;

    public Service(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setService(this);
    }

    public String getName() {
        return name;
    }

}
