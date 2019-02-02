package chapter2.exercices.exercice1;

public class Main {
    public static void main(String[]args){
        Dice dice = Dice.getDice();
        dice.twoDicesGame(args[0]);
    }
}
