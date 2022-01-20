package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



/**
 * what are streams?
 * - very similar to js iterators
 * They are methods that allow us to traverse a set of data (i.e. a list) and process each element in a certain way
 *
 * why do we use streams?
 * They make the code easier to read and so easier to maintain (do not need to create a bunch of variables ourselves)
 * processing effeciency - for loops will most often beat streams
 *
 * streams do not modify the original array list
 * we will need to extract a list from the outcome of the steam
 * Steeams usually have either a list or a string as output after collection
 *
 *
 * how to write streams?
 *
 */
public class App 
{
    private static List<Person> getPeople() {
        return List.of(
                new Person("ben", 25, City.MELBOURNE), new Person("Jay", 45, City.SYDNEY)
        );
    public static void main( String[] args ) {
        List<Person> people = getPeople();

        //filter - we want to filter by city

            List<Person> inSydney = people.steam().filter(person -> person.getCity().equals(City.SYDNEY)).collect(Collectores.toList());

            //inSydney.forEach(System.out::println);

            // Sort - Sorting Array on one or more conditions

            //List<Person> SortedByAge = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
            List<Person> SortedByAge = people.stream().sorted(Comparator.comparing(Person::getAge)).thenComparign(Person::getCity).collect(Collectors.toList());
    }
//        List<String> japan = Arrays.asList("Ben S.", "Jay A.", "Jay Y.", "Kenny W.", "Raf R.");
//
//        System.out.println(Cohort.isPresent("Ben S.", japan));
//
//        System.out.println();

        // reduce() -

        List<String> name = Arrays.asList("Ben", "Raf", "Kenny", "Jay Y", "Jay A");



        boolean overEighteen = people.stream
    };

}
