package org.example;

/**
 * What is a class?
 * - template of an object or instant
 * what is an object
 * what is an instance
 * what are scopes
 * how can we add properties to a class
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         //instantiate it

        Person person = new Person();

        System.out.printf("My name is %s \n", person.name);

        person.setName("Remi");

        System.out.printf("My name is %s \n", person.name);

        Person person1 = new Person("Bob", 30);


        System.out.printf("My name is %s \n", person1.name);
    }
}
