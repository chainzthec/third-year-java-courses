package firstCourse;

import tools.ExceptionHandler;

public class ThirdExercise {

    private void exceptionOne(String[] stringArray) {
        for (String elem : stringArray) {
            try {
                Integer.parseInt(elem);
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
    }

    private void exceptionTwo(String[] stringArray) {
        for (String elem : stringArray) {
            try {
                Integer.parseInt(elem);
            } catch (NumberFormatException e) {
                System.out.println(elem + " n'est pas un nombre");
                ExceptionHandler.getMethodNameFromIndex(e, e.getStackTrace().length - 2);
            }
        }
    }

    private void exceptionThree() {
        throw new RuntimeException("Test runtime exception");
    }

    public static void main(String[] args) {

        //Variables init
        ThirdExercise exercice3 = new ThirdExercise();
        String[] arr = {"156465", "16546534", "Hello World!"};

        // Part 1
        exercice3.exceptionOne(arr);
        // Part 2
        exercice3.exceptionTwo(arr);
        // Part 3
        exercice3.exceptionThree();

    }
}
