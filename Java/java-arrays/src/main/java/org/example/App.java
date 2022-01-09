package org.example;

import java.util.Arrays;

/**
 * Java Arrays?
 * what is an arrya?
 * what are the limitation of arrays?
 * how can we resize arrays?
 * best way to resize an array?
 */
public class App 
{
    public static void main( String[] args )
    {
        int [] intArray= {1,2,3};
        System.out.printf("%d%n", intArray[0]);
        System.out.printf("%d%n", intArray[1]);
        System.out.printf("%d%n", intArray[2]);

        int[] intArray2 = new int[3];
        intArray2[0] = 1;
        intArray2[1] = 2;
        intArray2[2] = 3;

        System.out.println(intArray2);
        System.out.println(Arrays.toString(intArray2));

        // resizing
        int[] ages = {18, 19,20};
        //ages[3]= 123;
        //System.out.println(Arrays.toString(ages));

        ages = Arrays.copyOf(ages, ages.length+1);
        //ages[3]= 123;
        System.out.println(Arrays.toString(ages));

        int[] noDefaults = new int[100];
        System.out.println(Arrays.toString(noDefaults));

        String[] Defaults = new String[100];
        System.out.println(Arrays.toString(Defaults));

        System.out.println(ArrayUtils.increment());
    }
}
