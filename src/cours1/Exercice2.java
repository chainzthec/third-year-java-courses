package cours1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercice2 {

    public void afficherFichier(String nomFichier) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
        String line = reader.readLine();
        System.out.println(line);
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void extractMailAndPointFromFile(String nomFichier) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(nomFichier));
        String line = reader.readLine();
        while((line = reader.readLine()) != null){

        }
    }

    public static void main(String[] args) throws IOException {
        Exercice2 exDeux = new Exercice2();
        exDeux.afficherFichier("misc/test.txt");
    }
}
