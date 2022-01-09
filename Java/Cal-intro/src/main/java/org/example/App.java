package org.example;

/**
 * What is a class:
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Person person = new Person("Jay Yoon", 25, "pink");
       Person person2 = new Person("Calum Hill", 30);
       Person person3 = new Person();



       System.out.printf("My name is %s%n", person.getName());
        System.out.printf("My favourite colour is %s%n", person.getFaveColor());
       System.out.printf("My name is %s%n", person2.getName());
       System.out.printf("My name is %s%n", person3.getName());

       System.out.printf("the sum is %d%n", MathUtils.sum(1,2));
        System.out.printf("the sum is %d%n", MathUtils.sum(1,2,5));
        System.out.printf("the sum is %d%n", MathUtils.sum(1,2,5,20));


        System.out.printf("The area of the circle is  %f%n", findCircleArea.area(5));

        System.out.printf("the full name is %s%n", Fullname.name("Remi", "Hoppe"));
    }
}
