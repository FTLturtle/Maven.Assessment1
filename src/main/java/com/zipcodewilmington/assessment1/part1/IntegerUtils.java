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
        for (int i = 1; i < n + 1; i++) { // NOTE: the test checks for sums from 0 to n, including n, so I have written my method to match that rather than the description above.
            sum += i;
        }
        return sum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int product = 1;
        for (int i = 2; i < n + 1; i++) { // NOTE: the test checks for products from 0 to n, including n, so I have written my method to match that rather than the description above.
            product *= i;
        }
        return product;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        String reversedIntegerString = BasicStringUtils.reverse(val.toString());
        return Integer.parseInt(reversedIntegerString);
    }
}
