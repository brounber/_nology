package com.company;

// dog age differently than humans
public class Dog {
    private String breed;
    private String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public int setAge(int age) {
        //first dog year is 15 human years
        // second dog year is 9 years
        // every dog year after that is 4 human years

        int tmp = 0;

        if(age<1) {
            this.age = 0;
        }
        if (age>1) {
            age -= 1;
            tmp =+ 15;
        }

        if (age >1) {
            age -= 1;
            tmp += 9;
        }
        while (age-- !=0) {
            tmp += 4;
        }

        this.age = tmp;
    };

    public int getAge() {
        int tmp = this.age;
        int humanYears = 0;

        if (tmp >25) {
            tmp -= 15;
            ++humanYears;
        }

        humanYears += tmp /4;
        return humanYears;
    }

}
