package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        for (Object o: objectArray) {
            if (o.equals(objectToCount)) {
                count++;
            }
        }
        return count;
    }

    /**
     * @param integerArray    an array of type Integer
     * @param integerToRemove a value to be removed from the `integerArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Integer[] removeValue(Integer[] integerArray, Integer integerToRemove) {
        ArrayList<Integer> removerArrayList = new ArrayList<Integer>(Arrays.asList(integerArray));

        while (removerArrayList.remove(integerToRemove));
        // NOTE: the above while statement works because the remove() method of the arrayList class returns true if the
        // specified object has been found and returns false if the object has not been found.

        // NOTE: The test class doesn't compile if the method returns an array of objects, because Java does not allow a
        // method return value of type Object[] to be downcast to Integer[]. So, I am instead returning an Integer
        // array. Additionally, Java does not support generic array creation. This method would work if we were
        // expected to return an ArrayList, since that can be declared generically. For example:
        // public static ArrayList<?> arrayListRemoveValue(Object[] objectArray, Object objectToRemove) {}

        return removerArrayList.toArray(new Integer[0]);
    }

    /**
     * @param integerArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    @SuppressWarnings("Duplicates")
    public static Integer getMostCommon(Integer[] integerArray) {
        ArrayList<Integer> frequencyCheckArrayList = new ArrayList<>(Arrays.asList(integerArray));

        Integer mostFrequentInteger = null;
        int highestFrequency = 0;
        int nextFrequency;

        for (Integer integer : frequencyCheckArrayList) {
            nextFrequency = Collections.frequency(frequencyCheckArrayList, integer);
            if (nextFrequency > highestFrequency) {
                highestFrequency = nextFrequency;
                mostFrequentInteger = integer;
            }
        }
        
        return mostFrequentInteger;
    }


    /**
     * @param integerArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    @SuppressWarnings("Duplicates")
    public static Integer getLeastCommon(Integer[] integerArray) {
        ArrayList<Integer> frequencyCheckArrayList = new ArrayList<>(Arrays.asList(integerArray));

        Integer leastFrequentInteger = null;
        int lowestFrequency = Integer.MAX_VALUE;
        int nextFrequency;

        for (Integer integer : frequencyCheckArrayList) {
            nextFrequency = Collections.frequency(frequencyCheckArrayList, integer);
            if (nextFrequency < lowestFrequency) {
                lowestFrequency = nextFrequency;
                leastFrequentInteger = integer;
            }
        }

        return leastFrequentInteger;
    }

    /**
     * @param integerArray      an array of any type of Object
     * @param integerArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Integer[] mergeArrays(Integer[] integerArray, Integer[] integerArrayToAdd) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(integerArray));
        arrayList1.addAll(Arrays.asList(integerArrayToAdd));
        return arrayList1.toArray(new Integer[0]);
    }
}
