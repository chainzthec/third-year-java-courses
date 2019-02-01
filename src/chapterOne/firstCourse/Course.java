package chapterOne.firstCourse;

import java.util.Arrays;

public class Course {

    private void permute() {
        Integer[] a = {10, 20, 30};
        Integer[] b = {40, 50, 60};
        Integer[] temp;
        //Swap two arrays
        temp = a;
        a = b;
        b = temp;
        String aString = Arrays.deepToString(a);
        String bString = Arrays.deepToString(b);
        System.out.println("a = " + aString + " b = " + bString);
    }

    private void stringBuilderInitializor() {
        //Complete construction of an array of 10 SB
        StringBuilder[] sb = new StringBuilder[10];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("a");
            i++;
        }
        String sbString = Arrays.deepToString(sb);
        System.out.println("sb = " + sbString);
    }

    private void staticAddToArray(String[] array, String value) {
        String[] result = new String[array.length + 1];
        for (String elem : array) {
            System.out.println(elem);
        }
        result[result.length - 1] = value;
    }

    private void training() {
        String address = "abc@esgi.fr";
        String resultat = address.substring(address.indexOf("@") + 1, address.lastIndexOf(".")).toUpperCase();
        System.out.println(resultat);
    }

    public static void main(String[] args) {
        Course course = new Course();
        course.training();
        course.permute();
        course.stringBuilderInitializor();
        String[] array = {"Test1", "Test2", "Test3", "Test4"};
        course.staticAddToArray(array, "Test5");
        course.staticAddToArray(array, "Test6");
    }
}
