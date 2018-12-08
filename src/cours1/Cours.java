package cours1;

import java.util.Arrays;

public class Cours {
    private void permute() {
        Integer[] a = {10, 20, 30};
        Integer[] b = {40, 50, 60};
        Integer[] temp;

        //Permutation de deux tableaux
        temp = a;
        a = b;
        b = temp;
        String aString = Arrays.deepToString(a);
        String bString = Arrays.deepToString(b);
        System.out.println("a = " + aString + " b = " + bString);
    }

    private void stringBuilderInitializor() {
        //Construction complète d'un tableau de 10 SB
        StringBuilder[] sb = new StringBuilder[10];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("a");
            i++;
        }
        String sbString = Arrays.deepToString(sb);
        System.out.println("sb = " + sbString);
    }

    private String[] staticAddToArray(String[] array, String value) {
        String[] result = new String[array.length + 1];
        result = array;
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        result[result.length] = value;
        return result;
    }

    private void entrainement() {
        String adresse = "abc@esgi.fr";
        String resultat = adresse.substring(adresse.indexOf("@") + 1, adresse.lastIndexOf(".")).toUpperCase();
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        Cours cours = new Cours();
        cours.entrainement();
        //main.permute();
        //main.stringBuilderInitializor();
        String[] array = {"Test1", "Test2", "Test3", "Test4"};
        cours.staticAddToArray(array, "Test5");
    }
}
