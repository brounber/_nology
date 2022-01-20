package org.example;

import lombok.Getter;
import lombok.Setter;

import java.beans.ExceptionListener;

class TriangleException extends Exception {
    public TriangleException (String errorMessage) {
        super(errorMessage);
    }
}

public class Triangle {
    // Regular Triangle
    //double
    // Double = reference type to a primative of double

    @Getter @Setter
    private Double side = null;

    public Triangle() {};
    public Triangle(Double side) {
        this.side=side;
    }

    public Double getPerimeter() throws TriangleException {
        //we want to throw an error if side is negative number
        if(this.side <= 0) {
            throw new TriangleException("Triangle: the sides must be a positive numbers");
        }
        // we want to throw an error if sides is null
        if(this.side == null) {
            throw new TriangleException("Triangle: You have not set the legnth of the sides");
        }
        return this.side * 3;




    }



}
