package com.company;

public class Person {

    private String name ;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public String setName(String newName) {
        return this.name = newName;
    }
}
