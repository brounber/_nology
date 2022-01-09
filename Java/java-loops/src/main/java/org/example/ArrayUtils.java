package org.example;

public class ArrayUtils {

    public static void reverse(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;

        while (head < tail) {
            int current = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = current;
        }
    }

    public static void palindrome(String word) {
        //reverse comparion
        // loop to reverse
        // loop to compare

        //while
        // 1
        // n

        int head = 0;
        int tail = word.length() -1;

        while (head < tail) {
            if (word.charAt(head++) != word.charAt(tail--)) {
                //return false;
            }
        }

        // return true;
    }


}
