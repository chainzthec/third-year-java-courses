package chapter2.exercices.exercice2;

import tools.ExecutionTime;

public class Main {
    public static void main(String[] args) {
        ExecutionTime.start();
        // a)
        Application application = new Application();
        application.print();
        // part one
        System.out.println("Average of the first student: ");
        System.out.println(application.average(0));
        // part two
        System.out.println("Average marks of the second student: ");
        System.out.println(application.average(1));
        // part three
        application.add(1,20,"Swift");
        System.out.println("New average marks of the second student: ");
        System.out.println(application.average(1));
        // part four
        System.out.println("The highest marked course");
        System.out.println(application.compute());
        // part five
        System.out.println("All students average :");
        application.showAvgs(application.avgs());
        // b)
        application.testHashSet();
        // HashSet permet d'éviter
        ExecutionTime.end();
    }

}
