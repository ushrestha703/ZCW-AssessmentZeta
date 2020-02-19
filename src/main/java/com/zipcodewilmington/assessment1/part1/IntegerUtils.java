package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {

        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
           sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int multi = 1;
        for (int i = 1; i <= n; i++)
        {
            multi *= i;
        }
        return multi;
    }


    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        //int reverse = 0;
        //while (val != 0)
       // {
         //   int digit = val % 10;
          //  reverse = reverse * 10 + digit;
           // val /= 10;
        //}
        //return reverse;

        String s = Integer.toString(val);
        s = BasicStringUtils.reverse(s);
        return new Integer(s);

    }
}
