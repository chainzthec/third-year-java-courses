package cours1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;

public class Exercice2 {

    private void afficherFichier(String nomFichier) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
        String line = reader.readLine();
        System.out.println("Liste des notes : \n");
        System.out.println(line);
        while ((line = reader.readLine()) != null)
            System.out.println(line);
        System.out.println();
    }

    private void extractMailAndPointFromFile(String nomFichier) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
        ArrayList<String> scoreList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null)
            scoreList.add(line.split(":")[1]);
        System.out.println("La moyenne des notes est " + averageStringArrayList(scoreList));
        reader.close();
    }

    private int averageStringArrayList(ArrayList<String> arrList) {
        int total = 0;
        for (String elem : arrList)
            total += Integer.parseInt(elem);
        return total / arrList.size();
    }

    public static void main(String[] args){
        //Heure actuelle
        Instant start = Instant.now() ;
        Exercice2 exDeux = new Exercice2();
        try {
            exDeux.afficherFichier("misc/test.txt");
            exDeux.extractMailAndPointFromFile("misc/test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // calcul d'une durée
        Duration duration = Duration.between(start, Instant.now()) ;
        System.out.println("Le temps d'exécution était de " + duration);
    }
}
