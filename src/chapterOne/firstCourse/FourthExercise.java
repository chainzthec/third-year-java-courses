package chapterOne.firstCourse;

import tools.ExceptionHandler;
import tools.ExecutionTime;
import tools.StringFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class FourthExercise {

    private void partOne(String[] args) {
        if (args.length > 1) {
            if (!(args[0].matches("\\w+") && args[1].matches("\\w+")))
                throw new StringIndexOutOfBoundsException("String doesn't contain valid characters.");
            else
                System.out.println("String is valid.");
        } else
            System.out.println("No string given in arguments.");
    }

    private String partTwo(int pos, String str) {
        String leftPart = str.substring(pos);
        String rightPart = str.substring(0, pos);
        String result = leftPart + rightPart;
        return result;
    }

    private String partThree(int pos, String str) {
        String leftPart = str.substring(0, pos);
        String rightPart = str.substring(pos);
        String result = rightPart + leftPart;
        return result;
    }

    private ArrayList partFourUpdateConditionAIndex(int a, String[] args) {
        boolean containsConditionA = false;
        for (String arg : args) {
            if (arg.equals("/a")) {
                a++;
                containsConditionA = true;
                break;
            }
            a++;
        }
        ArrayList arr = new ArrayList();
        arr.add(a, containsConditionA);
        return arr;
    }

    private boolean partFourVerifyIfAnagramExists(String[] args, int conditionAIndex, boolean anagramFound) {
        int j = 0;
        boolean status;
        char[] elem1Array;
        char[] elem2Array;
        for (String elem : args) {
            if (!elem.equals("/a") && j < conditionAIndex) {
                elem1Array = StringFormatter.strToLowerCharArray(elem);
                elem2Array = StringFormatter.strToLowerCharArray(args[conditionAIndex + 1]);
                Arrays.sort(elem1Array);
                Arrays.sort(elem2Array);
                status = Arrays.equals(elem1Array, elem2Array);
                if (status) {
                    anagramFound = true;
                    System.out.println(elem + " est un anagramme de " + args[conditionAIndex + 1]);
                }
            }
            j++;
        }
        return anagramFound;
    }

    private void partFour(String[] args, FourthExercise fourthExercise) {

        //Verify number of arguments
        ExceptionHandler.verifyNumberOfArguments(args, 4);

        //Verify if conditionA is in the argument list and returns its index.
        ArrayList conditionsArrayList = fourthExercise.partFourUpdateConditionAIndex(-1, args);
        int conditionAIndex = (int) conditionsArrayList.get(0);
        boolean containsConditionA = (boolean) conditionsArrayList.get(1);
        boolean anagramFound = false;

        System.out.println(conditionAIndex);

        //Verify if an anagram exists
        if (containsConditionA)
            anagramFound = fourthExercise.partFourVerifyIfAnagramExists(args, conditionAIndex, anagramFound);

        if (!anagramFound)
            System.out.println("There is no anagram in the given arguments !");
    }


    private void partFive(String[] args, FourthExercise fourthExercise) {
        ExceptionHandler.verifyNumberOfArguments(args, 4);

        if (args[args.length - 2].equals("/o")) {
            String[] result = args;
            //Process
            result = fourthExercise.partFiveGetElemReplaced(result, args);
            //Display
            for (String elem : result) {
                System.out.print(elem + " ");
            }
            System.out.println();
        } else {
            System.out.println("No element was deleted because argument \"/o\" wasn't found.");
        }
    }

    private String[] partFiveGetElemReplaced(String[] result, String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (i != args.length - 1 && i != args.length - 2) {
                boolean contains;
                contains = args[i].toLowerCase().contains(args[args.length - 1].toLowerCase());
                if (contains)
                    result[i] = args[i].replace(args[args.length - 1], "");
            }
        }
        return result;
    }

    private void partSix(String[] args, FourthExercise fourthExercise) {
        ExceptionHandler.verifyNumberOfArguments(args, 4);

        if (args[args.length - 2].equals("/f")) {
            String stringToCompare = args[args.length - 1];
            partSixReturnNumberOfOccurrences(args, stringToCompare);
        } else {
            System.out.println("No element was deleted because argument \"/f\" was not found.");
        }
    }

    private void partSixReturnNumberOfOccurrences(String[] args, String strToCompare) {
        int x = 0;
        for (int i = 0; i < args.length - 3; i++) {
            if (StringFormatter.substringInStr(args[i], strToCompare))
                x++;
        }
        System.out.println("The number of occurrences of the string is :" + x);
    }

    private void partSeven(String[] args, FourthExercise fourthExercise) {
        ExceptionHandler.verifyNumberOfArguments(args, 4);


    }

    public static void main(String[] args) {
        ExecutionTime.start();
        FourthExercise fourthExercise = new FourthExercise();
        //part 1
        System.out.println("--- PART 1 ---");
        fourthExercise.partOne(args);
        //part 2
        System.out.println("--- PART 2 ---");
        String testPartTwo1 = "abcdef";
        String testPartTwo2 = "sananes";
        System.out.println(fourthExercise.partTwo(3, testPartTwo1));
        System.out.println(fourthExercise.partTwo(3, testPartTwo2));
        //part 3
        System.out.println("--- PART 3 ---");
        String testPartThree1 = "defabc";
        String testPartThree2 = "sananes";
        System.out.println(fourthExercise.partThree(3, testPartThree1));
        System.out.println(fourthExercise.partThree(3, testPartThree2));
        //part 4
        System.out.println("--- PART 4 ---");
        //fourthExercise.partFour(args, fourthExercise); // exemple : java chapterOne.firstCourse.FourthExercise. bbac aacp /a acpa returns :  aacp is an anagram of acpa
        //part 5
        System.out.println("--- PART 5 ---");
        //fourthExercise.partFive(args, fourthExercise);
        //part 6
        System.out.println("--- PART 6 ---");
        //fourthExercise.partSix(args, fourthExercise);
        //part 7
        System.out.println("--- PART 7 ---");
        fourthExercise.partSeven(args, fourthExercise);
        ExecutionTime.end();
    }
}
