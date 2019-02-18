package com.zipcodewilmington.assessment1.part2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        return deleteMultiplesOfN(ints, 2);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        return deleteNonMultiplesOfN(ints, 2);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        return deleteMultiplesOfN(ints, 3);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> deleteEvensArrayList = new ArrayList<>(Arrays.asList(ints));
        int index = 0;

        while (index < deleteEvensArrayList.size()) {
            if (Math.floorMod(deleteEvensArrayList.get(index), multiple) == 0) {
                deleteEvensArrayList.remove(index);
                index--;
            }
            index++;
        }

        return deleteEvensArrayList.toArray(new Integer[0]);
    }

    public Integer[] deleteNonMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> deleteEvensArrayList = new ArrayList<>(Arrays.asList(ints));
        int index = 0;

        while (index < deleteEvensArrayList.size()) {
            if (Math.floorMod(deleteEvensArrayList.get(index), multiple) != 0) {
                deleteEvensArrayList.remove(index);
                index--;
            }
            index++;
        }

        return deleteEvensArrayList.toArray(new Integer[0]);
    }
}
