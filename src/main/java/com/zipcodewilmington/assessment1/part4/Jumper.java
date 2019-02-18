package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        return k / j + k % j;
        // NOTE: the integer division of flag height k by jump height j determines the total number of jumps of height
        // j the jumper can make before overshooting the flag. The modulus of k by j determines the distance remaining
        // to the flag after making k / j jumps. The remaining distance to the flag can be traversed in a number of
        // height 1 jumps equal to the distance remaining. Thus the sum of k / j and k % j will determine the minimum
        // number of jumps for the jumper to reach the flag.
    }
}
