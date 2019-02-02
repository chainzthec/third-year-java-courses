package chapter2.exercices.preamble.partTwo.caseOne;

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

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
