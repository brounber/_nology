package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Triangle myTriangle = new Triangle(100.0);
        System.out.printf("Side Length is %f \n", myTriangle.getSide());

        try {
            System.out.printf("Preimeter of Triangle is: %f \n", myTriangle.getPerimeter());
        } catch (TriangleException error) {
            System.out.println("The getPerimeter method failed");
            System.out.printf("The error that occured was: %s", error.toString());
        }
    }
}
