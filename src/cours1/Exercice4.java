package cours1;

public class Exercice4 {

    private void partOne(String[] args){
        if(!(args[0].matches("\\w+") && args[1].matches("\\w+")))
            throw new StringIndexOutOfBoundsException("La chaîne de caractère contient des éléments non autorisés");
    }
    private void partTwo(){

    }
    private void partThree(){

    }
    private void partFour(){

    }
    private void partFive(){

    }
    private void partSix(){

    }
    private void partSeven(){

    }


    public static void main(String[] args){
        Exercice4 exercice4 = new Exercice4();
        //part 1
        if(args.length > 1)
            exercice4.partOne(args);
        //part 2
        exercice4.partTwo();
        //part 3
        exercice4.partThree();
        //part 4
        exercice4.partFour();
        //part 5
        exercice4.partFive();
        //part 6
        exercice4.partSix();
        //part 7
        exercice4.partSeven();

    }
}
