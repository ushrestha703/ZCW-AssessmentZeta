package com.zipcodewilmington.assessment1.part2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {

        int count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToCount) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {

        //   *************************
        //ArrayList<Object> tmp = new ArrayList<>();
        //for (Object to : objectArray) {
        //  if (!to.equals(objectToRemove)) tmp.add(to);
        //}
        //Integer[] foo = new Integer [tmp.size()];
        //return tmp.toArray(foo);

        // *******************************

        int rm = 0;
        for (Object to : objectArray) {
            if (to.equals(objectToRemove)) rm++;
        }
        Integer[] result = new Integer[objectArray.length - rm];
        int j = 0;
        for (Integer i = 0; i < objectArray.length; i++) {
            if (!objectArray[i].equals(objectToRemove)) {
                result[j] = (Integer) (objectArray[i]);
                j++;
            }
        }
        return result;


        // *******************************
      /*  Integer count = 0;
        for (int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] == objectToRemove){
                count++;
            }
        }
        int j = 0;
        Integer[] newValue = new Integer[objectArray.length - count];

        for ( int i = 0; i < objectArray.length; i++) {
            if (objectArray[i] != objectToRemove) {
                newValue[j++] = objectArray[i];
            }
        }

        return newValue;

       */
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {

        int max = 0;
        int occ = 0;
        Object result = null;
        for (Object to : objectArray) {
            occ = getNumberOfOccurrences(objectArray, to);
            if (occ > max) {
                max = occ;
                result = to;
            }
        }
        return result;


       /*
        int count = 1, tempCount;

        int popular = objectArray[0];
        int temp = 0;
        for (int i = 0; i < (objectArray.length - 1); i++)
        {
            temp = objectArray[i];
            tempCount = 0;
            for (int j = 1; j < objectArray.length; j++)
            {
                if (temp == objectArray[j])
                    tempCount++;
            }
            if (tempCount > count)
            {
                popular = temp;
                count = tempCount;
            }
        }
        return popular;

        */

    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {

        int min = objectArray.length;
        int occ = 0;
        Object result = null;
        for (Object x : objectArray) {
            occ = getNumberOfOccurrences(objectArray, x);
            if (occ < min) {
                min = occ;
                result = x;
            }
        }
        return result;

       /*
        Arrays.sort(objectArray);
        int n = objectArray.length;
        int min_count = n+1, res = -1;
        int curr_count = 1;

        for (int i = 1; i < n; i++) {
            if (objectArray[i] == objectArray[i - 1])
                curr_count++;
            else {
                if (curr_count < min_count) {
                    min_count = curr_count;
                    res = objectArray[i - 1];
                }

                curr_count = 1;
            }
        }

        if (curr_count < min_count)
        {
            min_count = curr_count;
            res = objectArray[n - 1];
        }

        return res;


        */
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {

        ArrayList<Object> result = new ArrayList<>();
        for (Object x : objectArray) {
            result.add(x);
        }
        for (Object x : objectArrayToAdd) {
            result.add(x);
        }
        Integer[] array = result.toArray(new Integer[objectArray.length + objectArrayToAdd.length]);
        return array;
       /*
        Integer[] combined = new Integer[objectArray.length + objectArrayToAdd.length];

        int count = 0;

        for (int i = 0; i < objectArray.length; i++) {
            combined[i] = objectArray[i];
            count++;
        }
        for (int j = 0; j < objectArrayToAdd .length; j++) {
            combined[count++] = objectArrayToAdd[j];
        }
        return combined;

    }

        */
    }
}
