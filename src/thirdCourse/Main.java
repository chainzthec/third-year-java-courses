package thirdCourse;

public class Main {

    public static void main(String[] args){
        Employee employee1 = new Employee("Jean-Claude","Dupont", 4000);
        Employee employee2 = new Employee("Marie-Danielle","Defontaine", 4500);
        Project p1 = new Project("Project A","3 days",5000.00);
        p1.addEmployee(employee1);
        p1.addEmployee(employee2);
        p1.displayEmployees();
        p1.removeEmployee(1);
        p1.displayEmployees();
        p1.getEmployee(0).setFirstname("Jean");
        employee1.toString();
        p1.displayEmployees();
    }
}
