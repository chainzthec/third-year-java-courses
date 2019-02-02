package chapter1.exercices;

import tools.ExceptionHandler;
import tools.ExecutionTime;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercice2 {

    private void afficherFichier(String fileName) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            System.out.println("Evaluation score list: \n");
            System.out.println(line);
            while ((line = reader.readLine()) != null)
                System.out.println(line);
            System.out.println();
        } catch (IOException e) {
            System.out.println("Exception coming from method: " + e.getStackTrace()[e.getStackTrace().length - 2]);
        }
    }

    private void extractMailAndPointFromFile(String fileName) {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            ArrayList<String> scoreList = new ArrayList<>();
            String line;
            while ((line = reader.readLine()) != null)
                scoreList.add(line.split(":")[1]);
            System.out.println("The average evaluation score is : " + averageStringArrayList(scoreList));
            reader.close();
        } catch (IOException e) {
            ExceptionHandler.getMethodNameFromIndex(e, e.getStackTrace().length - 2);
        }
    }

    private int averageStringArrayList(ArrayList<String> arrList) {
        int total = 0;
        for (String elem : arrList)
            total += Integer.parseInt(elem);
        return total / arrList.size();
    }

    public static void main(String[] args) {
        //Time calculation initialization
        ExecutionTime.start();
        Exercice2 exDeux = new Exercice2();
        String nomFichier = "misc/test.txt";
        exDeux.afficherFichier(nomFichier);
        exDeux.extractMailAndPointFromFile(nomFichier);
        //Time calculation end and display
        ExecutionTime.end();


    }
}
