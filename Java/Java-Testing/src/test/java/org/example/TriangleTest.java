package org.example;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    // [ClassName][test][WhatWeAreTesting]

    @Test
    public void testVoidConstructor() {
        Triangle testTriangle = new Triangle();
        Assert.assertEquals(null, testTriangle.getSide());
    }

    @Test
    public void testSideConstructor() {
        Triangle testTriangle = new Triangle(8000D);
        Assert.assertEquals((Double)8000D, testTriangle.getSide());
    }

    @Test
    public void TestIfGetPerimeterWorksWithValidSides() {
        Triangle testTriangle = new Triangle(100D);
        Double perimeter = null;

        try {
            perimeter = testTriangle.getPerimeter();
        } catch (TriangleException error) {
            Assert.fail("TriangleException was thrown with a valid side");
        }
        Assert.assertEquals((Double) 300D, perimeter);
    }
    @Test(expected = TriangleException.class)
    public void testGetPrimeterWithNullSide() throws TriangleException {
        Triangle testTriangle = new Triangle();
        testTriangle.getPerimeter();
    }

}
