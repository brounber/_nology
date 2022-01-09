package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        HashMap<String, String> students = new HashMap<>();
//
////        {
////            "asdfsadf": "asdfsadf" (JS)
////        }
//
//        students.put("Calum", "Rust");
//        students.put("Raf", "Java");
//        students.put("Kenny", "Javascript");
//
//        //limitation can not add what ever type
//
//        System.out.println(students);
//
//        students.remove("Calum");
//        System.out.println(students);
//
//        students.remove("ben");
//        System.out.println(students);
//
//
//        HashMap<String, String> students2 = new HashMap<>();
//        students2.put("Adan", "C#");
//        students2.put("Calum", "rust");
//
//
//        students.putAll(students2);
//        System.out.println(students);

        HashMap<String, Integer> coaches = new HashMap<>();

        coaches.put("Calum", 24);
        coaches.put("Aiden", 28);
        coaches.put("Remi", 32);

        // checking if a key or a value existis in a Hashmap
        System.out.printf("Calum is a coach at Nology: %s \n", coaches.containsKey("Calum"));
        System.out.printf("At least one coach is 28 years old: %s \n", coaches.containsValue(28));

        for (Map.Entry coach :coaches.entrySet()) {
            System.out.printf("%s is %d years old \n", coach.getKey(), coach.getValue());
        }

        //Iterating through HashMaps


        System.out.println("-------------------------------------");

        // no duplicate keys in HasMaps
        HashMap<String, String> students = new HashMap<>();

        students.put("Ben", "Mel");
        students.put("Ayson", "Mel");
        students.put("Yoon", "Syd");
        students.put("Raf", "Syd");

        System.out.println(students);
        students.put("Ben", "Hobart");
        System.out.println(students);

        // adding more elemnets to hasmaps

        System.out.println("Inital Student HashMaps");
        for (Map.Entry student : students.entrySet()) {
            System.out.println(student.getKey() +" "+student.getValue());
        }

        students.putIfAbsent("Roberto", "Syd");
        students.putIfAbsent("Raf", "NYC");
        for (Map.Entry student : students.entrySet()) {
            System.out.println(student.getKey() +" "+student.getValue());
        }

        HashMap <String, String> nologyCrew = new HashMap<>();
        nologyCrew.putAll(students);

        System.out.println(nologyCrew);

        // Removing key value pair from a HashMap

        System.out.println("Initial list of Students" + students);

        students.remove("Roberto");

        System.out.println("Updated list of student" + students);


    }
}
