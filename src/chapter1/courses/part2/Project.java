package chapter1.courses.part2;

import java.util.ArrayList;

public class Project {

    private String name;
    private Service service;
    private String duration;
    private double cash;
    private ArrayList<Employee> employees;

    public Project(String name, String duration, double cash) {
        this.name = name;
        this.duration = duration;
        this.cash = cash;
        this.employees = new ArrayList<>();
    }

    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void removeEmployee(int id) {
        employees.remove(id);
    }

    public void displayEmployees() {
        System.out.print("Employés du projet " + name);
        for (Employee employee : employees) {
            System.out.println("\n-----\nFirstname : " + employee.getFirstname() + "\nLastname : " + employee.getLastname() + "\nSalary : " + employee.getSalary() + "\n-----");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
