package com.company;

public class Main {

    public static void main(String[] args) {
	// ## Challenge: Class Constructors
        //
        //### MVP:
        //
        //-   Create a new class called Animal
        //-   It should have a name property (for the name of the animal, e.g cat, dog)
        //-   It should have a sound property (for the noise is makes, e.g oink)
        //-   It should default to a cat that meows
        //-   It should have a constructor that sets name and sound based on arguments
        //-   In your main function:
        //    -   instantiate a dog that woofs
        //    -   ... a bear that roars
        //    -   print each of their sounds to the console

        Animal Dog = new Animal("Dog",  "woofs");
        Animal Pig = new Animal("Pig",  "oinks");

        Animal cat = new Animal();
        System.out.println(cat.type);
        Animal dog = new Animal("dog", "woof");
        System.out.println(dog.type);
    }


}
