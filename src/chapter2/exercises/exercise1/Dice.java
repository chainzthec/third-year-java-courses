package chapter2.exercises.exercise1;

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
        for(i = 0; i < values.length; i++){
            System.out.println("Value of the dice n°" + (i+1) + " :");
            System.out.println(values[i]);
            if(i != 0)
                if(values[i] != values[i-1])
                    error = true;
        }
        if(error)
            System.out.println("You lost !");
        else
            System.out.println("You won !");
    }
}
