package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Person remi = new Person();
//        System.out.println(remi.name);

        Person remi = new Person("Remi", 32);

        System.out.println(remi.age);
        remi.setName("bob");
        System.out.println(remi.getName());
    }
}
