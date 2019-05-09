package chapter2.exercises.exercise1;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        ArrayList<Dice> dicesToRoll = new ArrayList<>();
        dicesToRoll.add(dice1);
        dicesToRoll.add(dice2);
        Dice.startGame(dicesToRoll);
    }
}
