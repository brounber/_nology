package org.example;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // define a array list of ints
        ArrayList<Integer> intArr = new ArrayList<Integer>();

        // add some numbers
        intArr.add(2);
        intArr.add(3);
        intArr.add(1, 1000);
        intArr.add(1, 2222);

        System.out.println(intArr);

        System.out.println(intArr.get(1));

        Integer last = intArr.remove(intArr.size() -1);
        System.out.println(intArr);
        System.out.println(last);

        Integer first = intArr.remove(0);
        System.out.println(intArr);
        System.out.println(last);

        intArr.add(1, 123);
        intArr.add(1, 223);
        intArr.add(1, 323);

        System.out.println(intArr);

        Integer prev = intArr.set(2, 512561361);
        System.out.println(intArr);
        System.out.println(prev);

        boolean check = intArr.contains(intArr);
        System.out.println(check);

        HashMap<String, String> students = new HashMap<>();

//        {
//            "asdfsadf": "asdfsadf" (JS)
//        }

        students.put("Calum", "Rust");
        students.put("Raf", "Java");
        students.put("Kenny", "Javascript");

        //limitation can not add what ever type

        System.out.println(students);

        students.remove("Calum");
        System.out.println(students);

        students.remove("ben");
        System.out.println(students);


        HashMap<String, String> students2 = new HashMap<>();
        students2.put("Adan", "C#");
        students2.put("Calum", "rust");


        students.putAll(students2);
        System.out.println(students);




    }
}
