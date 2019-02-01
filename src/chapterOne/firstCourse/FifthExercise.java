package chapterOne.firstCourse;

public class FifthExercise {

    private void displayVoisins(String[] words){

        for (int i = 0; i < words.length; i++){
            System.out.println("Voisins de " + words[i] + " :");
            if(i == 0 && areNeighbours(words[i+1],words[i])){

            }else if (i == words.length){

            }

        }


    }

    private boolean areNeighbours(String word1, String word2){
        return true;
    }



    public static void main(String[] args) {
        String[] words = {"aas", "ace", "alu", "are", "api", "ays",
                "bec", "bel", "bey", "ben", "boy", "deb", "des", "dom",
                "dot", "daw", "fax", "fan", "faq", "fob", "hem", "hop",
                "man", "mao", "mug", "mus", "mie", "sur", "dey", "mur"
        };

        //displayVoisins(words,);
    }
}
