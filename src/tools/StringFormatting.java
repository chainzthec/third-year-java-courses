package tools;

import java.util.Arrays;

public class StringFormatting {
    public static char[] strToLowerCharArray(String str) {
        return str.toLowerCase().toCharArray();
    }

    public static boolean substringInStr(String str, String substr) {
        if (str.toLowerCase().contains(substr.toLowerCase()))
            return true;

        return false;
    }
}
