package firstCourse;

public class ThirdExercise {
    private boolean exceptionOne(String[] stringArray) {
        for (String elem : stringArray) {
            try {
                Integer.parseInt(elem);
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
        return true;
    }

    private boolean exceptionTwo(String[] stringArray) {
        for (String elem : stringArray) {
            try {
                Integer.parseInt(elem);
            } catch (NumberFormatException e) {
                System.out.println(elem + " n'est pas un nombre");
                System.out.println("L'exception provient de la méthode : " + e.getStackTrace()[e.getStackTrace().length - 2].getMethodName());
                return false;
            }
        }
        return true;
    }

    private void exceptionThree(){
        throw new RuntimeException("Test runtime exception");
    }

    public static void main(String[] args) {
        ThirdExercise exercice3 = new ThirdExercise();

        String[] arr = {"156465", "16546534", "Bonjour"};

        // Part 1
        //exercice3.exceptionOne(arr);
        // Part 2
        //exercice3.exceptionTwo(arr);
        // Part 3
        //exercice3.exceptionThree();


    }
}
