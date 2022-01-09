package org.example;

public class Person {
    private int age;
    private String name;
    private String faveColor;

    public Person(){
        this.name = "Raf";
        this.age = 18;
        this.faveColor = "blue";
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, String faveColor){
        this.name = name;
        this.age = age;
        this.faveColor = faveColor;
    }

    public String getFaveColor() {
        return this.faveColor;
    }
    public void setFaveColor(String faveColor) {
        this.faveColor = faveColor;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void getAge(int age) {
        this.age = age;
    }


}
