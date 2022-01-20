package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Person remi = new Person("Remi", 32);
        System.out.println(remi.getName());
        System.out.println(remi.setName("bob"));
        System.out.println(remi.age);
        System.out.println(remi.species);

        Dog smalDog = new Dog("chew", "millie", 4);
        System.out.println(smalDog.name);
        System.out.println(smalDog.getAge());
        smalDog.setAge(32);
        System.out.println(smalDog.getAge());

        Animal Dog = new Animal("Dog",  "woofs");
        Animal Pig = new Animal("Pig",  "oinks");

        Animal cat = new Animal();
        System.out.println(cat.name);
        Animal dog = new Animal("dog", "woof");
        System.out.println(dog.name);


    }
}
