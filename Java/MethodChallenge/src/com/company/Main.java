package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// ### MVP:
        //-   Create method called findArea
        //-   It should take in a single parameter
        //    -   radius (of the circle)
        //-   It should return the area of the circle
        //## Challenge: Fullname Method
        //### MVP:
        //-   Create a method called fullName,
        //-   It should take in 2 parameters:
        //    -   firstName
        //    -   lastName
        //-   It should return a full name
        //## Challenge: Firstname Method
        //### MVP:
        //-   Create a method called fullName,
        //-   It should take in 1 parameter:
        //    -   fullName
        //-   It should return a first name
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius of the circle");
        double radius= scan.nextDouble();
        double area = Math.PI*radius*radius;
        System.out.printf("Area of Circle is: %d", area );

    }
}
