package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {
        if (stringArray.length == 0) {
            return null;
        }
        else
        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {
        if (stringArray.length < 2) {
            return null;
        }
        else
            return stringArray[1];

        //String secondElement = stringArray[1];
        //return secondElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the last element in the array
     */
    public static String getLastElement(String[] stringArray) {

        if (stringArray.length == 0) {
            return null;
        }
        else
            return stringArray[stringArray.length -1];


        // String lastElement = stringArray[stringArray.length - 1];
        //return lastElement;
    }

    /**
     * @param stringArray an array of String objects
     * @return the second to last element in the array
     */
    public static String getSecondToLastElement(String[] stringArray) {
        if (stringArray.length < 2) {
            return null;
        }
        else
            return stringArray[stringArray.length - 2];


        //String secondToLastElement = stringArray[stringArray.length - 2];
        //return secondToLastElement;
    }
}
