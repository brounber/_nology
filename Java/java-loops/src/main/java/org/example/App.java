package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int length = 6;
        int[] arr = new int[length];
        for (int i=0; i< length; ++i) {
            arr[i] = i +1;
        }

        System.out.println(Arrays.toString(arr));
        ArrayUtils.reverse(arr);
        System.out.println(Arrays.toString(arr));

        String word = "sbcdefedcba";
        String word2 = "asdfsd";

//        System.out.println(ArrayUtils.palindrome(word));
//        System.out.println(ArrayUtils.palindrome(word2));

        //2D
        int[][] my2dArr = new int[4][4];

        for (int i = 0; i< my2dArr.length; ++i) {
            for (int j=0; j< my2dArr[i].length; ++j) {
                my2dArr[i][j] = (i *4) * (j+1)* 2;
            }
        }
        System.out.println(Arrays.deepToString(my2dArr));


        //decrement
        for (int i = 0; i< my2dArr.length; ++i) {
            for (int j=0; j< my2dArr[i].length; ++j) {
                my2dArr[i][j] -= 1;
            }
        }
        System.out.println(Arrays.deepToString(my2dArr));


        //Challenge: Populating Multidimensional Arrays
        //Create a script that starts with the following code:
        //int a, b, c, d;
        //a, b = 2;
        //c = 3;
        //d = 4;
        //
        //int [][][][] fourDArray = new int[a][b][c][d];
        //
        //// Use for loops to fill this multi dimensional array with incremented values
        //MVP:
        //Using nested loops fill fourDArray with incremented values and print the values to the screen.
        //After filling fourDArray should look like the following:
        //[
        //    [
        //        [
        //            [1, 2, 3, 4],
        //            [5, 6, 7, 8],
        //            [9, 10, 11, 12]
        //        ],
        //        [
        //            [13, 14, 15, 16],
        //            [17, 18, 19, 20],
        //            [21, 22, 23, 24]
        //        ]
        //    ],
        //    [
        //        [
        //            [25, 26, 27, 28],
        //            [29, 30, 31, 32],
        //            [33, 34, 35, 36]
        //        ],
        //        [
        //            [37, 38, 39, 40],
        //            [41, 42, 43, 44],
        //            [45, 46, 47, 48]
        //        ]
        //    ]
        //]

        int[][][][] my4dArr = new int[4][4][3][4];
        int value = 1;
        for (int i = 0; i< my4dArr.length; i++) {
            for (int j=0; j< my4dArr[i].length; j++) {
                for (int k=0; k< my4dArr[i][j].length; k++) {
                    for (int m=0; m< my4dArr[i][j][k].length; m++) {
                        my4dArr[i][j][k][m] = value ++;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(my4dArr));


        //my2dArr[i][j] = (i *4) * (j+1)* 2;

    }
}
