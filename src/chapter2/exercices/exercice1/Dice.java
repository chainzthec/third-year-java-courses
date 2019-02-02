package chapter2.exercices.exercice1;

import java.util.Random;

class Dice {
    private static Dice dice;

    private Dice(){
    }

    static Dice getDice() {
        if(dice == null)
            dice = new Dice();
        return dice;
    }

    private int getValue(){
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    void twoDicesGame(String nbOfRolls){
        int rolls = Integer.valueOf(nbOfRolls);
        int temp = 0;
        int temp2;
        for(int i = 0; i < rolls * 2; i++){
            if(i % 2 == 0){
                temp = getValue();
                System.out.println(temp);
            }else{
                temp2 = getValue();
                System.out.println(temp2);
                if(temp2 == temp){
                    System.out.println("Gagné !");
                }else{
                    System.out.println("Perdu !");
                }
                temp = getValue();
            }
        }
    }
}
