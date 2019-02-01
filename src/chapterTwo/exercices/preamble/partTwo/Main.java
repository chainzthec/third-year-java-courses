package chapterTwo.exercices.preamble.partTwo;

import chapterTwo.exercices.preamble.partTwo.caseOne.Employee;
import chapterTwo.exercices.preamble.partTwo.caseOne.Service;
import chapterTwo.exercices.preamble.partTwo.caseThree.Course;
import chapterTwo.exercices.preamble.partTwo.caseThree.Result;
import chapterTwo.exercices.preamble.partTwo.caseThree.Student;
import chapterTwo.exercices.preamble.partTwo.caseTwo.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
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
        Person parent2 = new Person("John","David");
        ArrayList<Person> parents = new ArrayList<>();
        parents.add(parent1);
        parents.add(parent2);
        Person person = new Person("Jean", "David");
        System.out.println("Prénom de l'enfant : " + person.getFirstname());
        System.out.println("Nom de l'enfant : " + person.getLastname());
        person.setParents(parents);
        System.out.println("Prénom du parent 1 : "  + person.getParents().get(0).getFirstname());
        System.out.println("Nom du parent 1 : "  + person.getParents().get(0).getLastname());
        System.out.println("Prénom du parent 2 : "  + person.getParents().get(1).getFirstname());
        System.out.println("Nom du parent 2 : "  + person.getParents().get(1).getLastname());
        //case Three
        System.out.println("\n---CASE THREE----");
        Course course1 = new Course("Maths","B21");
        Student student1 = new Student("John", "David");
        Student student2 = new Student("Patrice", "Dupont");
        Result result = new Result(course1,student1,30);
    }
}
