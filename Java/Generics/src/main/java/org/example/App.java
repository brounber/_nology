package org.example;

import java.util.ArrayList;

/**
 * whwt is a generic type?
 * how can we write generic methods?
 * How can we write generic classes?
 *
 * Generic methods:
 * Whtey can use reference types (they can not use primitives types like ArrayList<int> > Array <Integer> </Integer></int>
 * public static <T> void methodName () {
 *
 * }
 *
 */
public class App 
{
    public static void main( String[] args )
    {
////        int[] myNums = {1,2,3,4,5};
////        double[] myDouble= {1,2,3,4,5};
////        String[] myLetters = {"a", "b", "c", "d"};
////
////
////        Integer[] myNumRef = {1,2,3,4,5};
////        Double[] myDoubleRef= {1.0,2.0,3.0,4.0,5.0};
////
////
////
////        PrintArray.printArray(myNums);
////        PrintArray.printArray(myDouble);
////        PrintArray.printArray(myLetters);
////
////        System.out.println("with Generic method");
////        PrintArray.printAnyArray(myNumRef);
//
//        Person<String> ben = new Person("dog");
//        Person<Integer> Remi = new Person(8000);
//        Person<Boolean> Calaum = new Person(true);
//
//        System.out.println(ben.getFaveThing());
//        System.out.println(Remi.getFaveThing());
//        System.out.println(Calaum.getFaveThing());
//
//        ArrayList<String> ListOfStrings = new ArrayList<>();
//        ListOfStrings.add("abc");
//        //ListOfStrings.add("abc"); will not work becuase the array list generifa class is in
//
        System.out.println(TestMax.whoIsMax(1,2,3));


    }
}

