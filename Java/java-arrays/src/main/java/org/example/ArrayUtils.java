package org.example;

//Create a class called ArrayUtils
//Create a static method that takes in an int[]
//... and returns a new int[] where all numbers have been incremented
//Input => Output Examples:
//{ 1, 2, 3 } => { 2, 3, 4 }
//{ 45, 23 } => { 46, 24 }
//{ } => { }
public class ArrayUtils {
    int[] arr = { 1, 2, 3 };
    int n = arr.length;

    public int[] increment(int [] arr){
        for (int i = 0; i < n; i++) {
            arr[i] = arr[i] + 1;
        }
        return arr;


    }

}
