package chapter4.cours.part2;

public class Main {

    public static void apply(int[] array, Compute comp){
        for(int i = 0; i < array.length;  i++){
            array[i] = comp.treatment(array[i]);
        }
    }

    public static void main(String[] args){
        int[]array = new int[]{20,10,11,15,16};
        apply(array,new Inc());

    }
}
