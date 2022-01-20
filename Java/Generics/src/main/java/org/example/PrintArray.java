package org.example;

public class PrintArray {
    // I want method that will let me print everything that is inside an array
    // printing array of int
    public static void printArray(int[] intArray) {
        for(int num: intArray) {
            System.out.printf("%s \n", num);
        }
    }
    // printing array of doubles
    public static void printArray(double[] doubleArray) {
        for(double num: doubleArray) {
            System.out.printf("%s \n", num);
        }
    }

    // printing array of strings

    public static void printArray(String[] StringArray) {
        for(String num: StringArray) {
            System.out.printf("%s \n", num);
        }
    }

    // printing any array using Generic Method

    public static <T> void printAnyArray(T[] anyArr) {
        for(T thing : anyArr) {
            System.out.printf("%s \n", thing);
        }
    }

}
