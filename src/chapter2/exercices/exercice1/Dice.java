package chapter2.exercices.exercice1;

import java.util.ArrayList;
import java.util.Random;

class Dice {
    private static Random random = new Random();
    private int value;

    public void rollTheDice(){
        this.value = random.nextInt(6) + 1;
    }

    public int getValue(){
        return this.value;
    }

    public static void startGame(ArrayList<Dice> dices){
        int[] values = new int[dices.size()];
        int i = 0;
        for(Dice dice : dices){
            dice.rollTheDice();
            values[i] = dice.getValue();
            i++;
        }
        boolean error = false;
        for(i = 1; i < values.length; i++){
            if(values[i])
        }
    }
}
