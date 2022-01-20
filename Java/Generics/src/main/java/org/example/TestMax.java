package org.example;

// bouding method
//forcing a method to use a set of types

public class TestMax {
    // we want to determine the larget of three different attributes/variables
    // keyword extends

    public static <T extends Comparable> T maximum (T x, T y, T z) {
        T max = x; // saying that x is the lartget to begin with

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static <T extends Comparable> T whoIsMax (T x, T y, T z) {
        return String.format("%s is the larget value \n", maximum(x, y, z));
    }

}
