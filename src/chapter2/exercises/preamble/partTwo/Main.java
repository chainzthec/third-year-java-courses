package chapter2.exercises.preamble.partTwo;

import chapter2.exercises.preamble.partTwo.caseOne.Employee;
import chapter2.exercises.preamble.partTwo.caseOne.Service;
import chapter2.exercises.preamble.partTwo.caseThree.Course;
import chapter2.exercises.preamble.partTwo.caseThree.Result;
import chapter2.exercises.preamble.partTwo.caseThree.Student;
import chapter2.exercises.preamble.partTwo.caseTwo.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //case One
        System.out.println("---CASE ONE----");
        Employee employee = new Employee("Jean-Claude", "Dupont");
        Service service = new Service("IT Service");
        service.addEmployee(employee);
        System.out.println("Nom du service : " + service.getName());
        System.out.println("Prénom de l'employé : " + employee.getFirstname());
        System.out.println("Nom de l'employé : " + employee.getLastname());
        System.out.println("Nom du service de l'employé : " + employee.getService().getName());
        //case Two
        System.out.println("\n---CASE TWO----");
        Person parent1 = new Person("Marie", "Noel");
        Person parent2 = new Person("John", "David");
        ArrayList<Person> parents = new ArrayList<>();
        parents.add(parent1);
        parents.add(parent2);
        Person person = new Person("Jean", "David");
        System.out.println("Prénom de l'enfant : " + person.getFirstname());
        System.out.println("Nom de l'enfant : " + person.getLastname());
        person.setParents(parents);
        System.out.println("Prénom du parent 1 : " + person.getParents().get(0).getFirstname());
        System.out.println("Nom du parent 1 : " + person.getParents().get(0).getLastname());
        System.out.println("Prénom du parent 2 : " + person.getParents().get(1).getFirstname());
        System.out.println("Nom du parent 2 : " + person.getParents().get(1).getLastname());
        //case Three
        System.out.println("\n---CASE THREE----");
        Course course1 = new Course("Maths", "B21");
        Result result1 = new Result(20.00);
        Result result2 = new Result(19.00);
        Student student1 = new Student("John", "David");
        Student student2 = new Student("Patrice", "Dupont");
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.giveMark(student1, result1);
        course1.giveMark(student2, result2);
        System.out.println("Prénom de l'étudiant : " + student1.getFirstname());
        System.out.println("Nom de l'étudiant : " + student1.getLastname());
        System.out.println("1ère note de l'étudiant 1 en maths : " + student1.getResults().get(0).getMark());
        System.out.println("1ère note de l'étudiant 2 en maths : " + student2.getResults().get(0).getMark());
        System.out.println("Informations relatives à la classe 1 : " + course1.toString());
    }
}
