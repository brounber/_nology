package org.example;

public class Person {
    // how do we add data (props) inside a class?
    // we want to add a name and an age to this class:

    private String name = "Remi";
    int age = 23;
    public String species = "human";

    public Person(String name, int age) {
        this.name = name;
    }

    //getter
    public String getName () {
        return name;
    }

    // setter
    public String setName (String newName) {
        return this.name = newName;
    }




}
