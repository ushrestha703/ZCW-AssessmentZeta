package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        //int sum = 0;
        //for (int i = 0; i < intArray.length; i++)
       // {
         //   sum += intArray[i];
       // }
       // return sum;

         Integer s = 0;
         for (Integer i : intArray) s += i;
         return s;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int multi = 1;
        for (int i = 0; i < intArray.length; i++)
        {
            multi *= intArray[i];
        }
        return multi;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        //Double sum = 0.0;
        //Double average;
        //for (int i = 0; i < intArray.length; i++)
       // {
         //   sum += intArray[i];
       // }
        //average = sum / intArray.length;
        //return average;

        return Double.valueOf(getSum(intArray)/intArray.length);

    }
}
