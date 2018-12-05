package cours1;

public class Exercice3 {
    private static boolean exceptionOne(String[] stringArray) {
        for (String elem : stringArray) {
            try {
                Integer.parseInt(elem);
            } catch (NumberFormatException e) {
                throw new NumberFormatException();
            }
        }
        return true;
    }

    private static boolean exceptionTwo(String[] stringArray) {
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

    private static boolean exceptionThree(String[] stringArray){
        try{

        }catch (){
            
        }
    }

    public static void main(String[] args) {
        String[] arr = {"156465", "16546534", "Bonjour"};

        // Part 1
        //exceptionOne(arr);
        // Part 2
        exceptionTwo(arr);


    }
}
