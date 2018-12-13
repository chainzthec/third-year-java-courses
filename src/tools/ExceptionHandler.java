package tools;

public class ExceptionHandler {
    public static void verifyNumberOfArguments(String[] args, int i){
        if (args.length != i)
            throw new IllegalArgumentException("Number of arguments must be superior or equal to "+ (i + 1) +" !");
    }
    public static void getMethodNameFromIndex(Exception e, int index){
        System.out.println("Exception threw from method: "  + e.getStackTrace()[index]);
    }

}
