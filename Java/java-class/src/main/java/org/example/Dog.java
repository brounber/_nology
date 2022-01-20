package org.example;

public class Dog {
    private String breed;
    public String name;
    private int age;

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public int getAge () {
        int tmpAge = this.age;
        int humanYear=0;

        if(tmpAge >= 15) {
            tmpAge -= 15;
            ++humanYear;
        }
        if (tmpAge >=9) {
            tmpAge -=9;
            ++humanYear;
        }

        humanYear += tmpAge/4;
        return humanYear;

    }

    public void setAge(int age) {
        // First dog year is 15 human years
        // second dog 9 year
        // every dog year after that is 4 human years

        int tmpAge = 0;
        if (age < 1) {
            this.age=0;
        }
        if (age > 1) {
            age-= 1;
            tmpAge = 15;
        }

        if (age > 1 )  {
            age -= 1;
            tmpAge +=9;
        }

        while (age-- !=0); {
            tmpAge += 4;
        }

        this.age=tmpAge;



    }
}
