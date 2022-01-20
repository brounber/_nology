package org.example;

public class Person {
    public int age = 34;
    public String name = "Calum";

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
