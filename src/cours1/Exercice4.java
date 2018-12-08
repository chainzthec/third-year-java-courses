package cours1;

import java.util.Arrays;

public class Exercice4 {

    //vérifie si les deux premiers arguments sont bien corrects
    private void partOne(String[] args) {
        if (!(args[0].matches("\\w+") && args[1].matches("\\w+")))
            throw new StringIndexOutOfBoundsException("La chaîne de caractère contient des éléments non autorisés");
        else
            System.out.println("La chaîne de caractère est valide");
    }

    //rotation vers la gauche
    private String partTwo(int pos, String str) {
        String leftPart = str.substring(pos);
        String rightPart = str.substring(0, pos);
        String result = leftPart + rightPart;
        return result;
    }

    //rotation vers la droite
    private String partThree(int pos, String str) {
        String leftPart = str.substring(0, pos);
        String rightPart = str.substring(pos);
        String result = rightPart + leftPart;
        return result;
    }

    private void partFour(String[] args) {
        boolean anagramFound = false;
        if (args.length == 4) {
            boolean containsConditionA = false;
            int conditionAIndex = -1;
            for (String arg : args) {
                if (arg.equals("/a")) {
                    conditionAIndex++;
                    containsConditionA = true;
                    break;
                }
                conditionAIndex++;
            }
            System.out.println(conditionAIndex);
            if (containsConditionA) {
                int j = 0;
                boolean status;
                for (String elem : args) {
                    if (!elem.equals("/a") && j < conditionAIndex) {
                        char[] elem1Array = elem.toLowerCase().toCharArray();
                        char[] elem2Array = args[conditionAIndex + 1].toLowerCase().toCharArray();
                        Arrays.sort(elem1Array);
                        Arrays.sort(elem2Array);
                        status = Arrays.equals(elem1Array, elem2Array);
                        if (status) {
                            anagramFound = true;
                            System.out.println(elem + " est un anagramme de " + args[conditionAIndex + 1]);
                        }
                    }
                    j++;
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Le nombre d'argument en exécution en ligne de commandes doit être égal à 5 !");
        }
        if(!anagramFound)
            System.out.println("Il n'y a aucun anagramme dans les arguments donnés");
    }

    private void partFive(String[] args) {
        String[] result = args;
        if(args.length == 4){
            if(args[args.length - 2].equals("/o")) {
                //Traitement
                for (int i = 0; i < args.length; i++) {
                    if (i != args.length - 1 && i != args.length - 2) {
                        boolean contains;
                        contains = args[i].toLowerCase().contains(args[args.length - 1].toLowerCase());
                        if(contains)
                            result[i] = args[i].replace(args[args.length - 1],"");
                    }
                }
                //Affichage
                for(String elem : result){
                    System.out.print(elem + " ");
                }
                System.out.println();
            }
            else{
                System.out.println("Aucun élément n'a été supprimé car l'argument \"/o\" n'a pas été trouvé ");
            }
        }else{
            throw new ArrayIndexOutOfBoundsException("Le nombre d'argument en exécution en ligne de commandes doit être égal à 5 !");
        }
    }

    public static void main(String[] args) {
        Exercice4 exercice4 = new Exercice4();
        //part 1
        System.out.println("--- PARTIE 1 ---");
        if(args.length > 1)
            exercice4.partOne(args);
        //part 2
        System.out.println("--- PARTIE 2 ---");
        System.out.println(exercice4.partTwo(3, "abcdef"));
        //part 3
        System.out.println("--- PARTIE 3 ---");
        System.out.println(exercice4.partThree(3, "defabc"));
        //part 4
        System.out.println("--- PARTIE 4 ---");
        exercice4.partFour(args); // exemple : java cours1.Exercice4. bbac aacp /a acpa renvoie :  aacp est un anagramme de acpa
        //part 5
        System.out.println("--- PARTIE 5 ---");
        exercice4.partFive(args);

    }
}