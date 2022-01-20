package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Cohort {

    public Cohort() {}:

//    public final List<String> japan = Arrays.asList(
//            "Ben S.", "Jay A.", "Jay Y.", "Kenny W.", "Raf R."
//    );

    //using loops - I want a method that will reutrn a boolean depending on if a strudent is present or not

    public static boolean isPresent(String name, List<String> array) {
        boolean isHere = false;
        String lowCaseName = name.toLowerCase();

        for(String student:array) {
            if(lowCaseName.contains(student.toLowerCase())) {
                isHere = true;
            }
            return isHere;
        }

        }

    //steam( method gives you access to all the different strams
    // anymatch >> .some() is js
    // array.stream().[stramMethodName](element -> element.somethjing())
    public static boolean isPresentWithStream(String name, List<String> array) {
        boolean isHere = false;
//        array.stream().anyMatch(student -> student.equalsIgnoreCase(name));
//        }
//    };
