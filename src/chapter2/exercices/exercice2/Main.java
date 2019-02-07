package chapter2.exercices.exercice2;

import tools.ExecutionTime;

public class Main {
    public static void main(String[] args) {
        ExecutionTime.start();
        Application application = new Application();
        application.print();
        ExecutionTime.end();
    }

}
