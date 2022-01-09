package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // what are interfaces?
        // why do we need/want interfgaces
        // what do interfaces allow us to do
        //when should we use interfaces

        // - interfaces are template/protocols for a set fo related method method that we want to implement inside certain
        // a class can impletment multiple interfaces (thus allowing for multi inheritance)
        // you can not create an object from an interface. They are not meant to be instantiated like regular classes. Only meant to be implemented


        // syntax for interfaces
        interface MakeSound {
            // by default , interfaces methods are abstact and public
            String sound();

            // create am amimal class that uses that MakeSound interface
            class Pig implements MakeSound {
                public Pig() {};
                public String sound() {
                    return "oink!";
                }
            }
            Pig myPig = new Pig();

            //System.out.printf("The pig says %s", myPig.sound());


        }

        public class Vehicle {
            interface getSpeed;
            int speed();

            interface decreaseSpeed;
            int slowSpeed();

            class Bike implements speed {
                public Bike() {};
                public speed() {
                    return 100;
                }
            }

            class Car  implements speed {
                public Car () {};
                public speed() {
                    return 50;
                }
            }

            Bike myBike = new Bike();
            Car myCar = new Car();

            System.out.printf("The Bike is going  %s miles/hour \n", myBike.speed());
            System.out.printf("The Car is going  %s miles/hour \n", myCar.speed());

        }
    }
}
