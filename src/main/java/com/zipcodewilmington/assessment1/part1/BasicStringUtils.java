package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String cap = str.substring(0,1).toUpperCase() + str.substring(1);
        return cap;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder = stringBuilder.reverse();
        return stringBuilder.toString();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {

        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder = stringBuilder.reverse();
        String cap = stringBuilder.toString();
        String cap1 = cap.substring(0,1).toUpperCase() + cap.substring(1);
        return cap1;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String result = str.substring(1, str.length()-1);
        return result;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++)
        {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
            else if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase((charArray[i]));
            }
        }
        str = new String(charArray);
        return str;
    }
}
