package org.example;

public class MyParentClass {
    float data;

    public MyParentClass() {

    };

    public MyParentClass(float data) {
        this.data = data;

    }

    public void parentMethod() {
        System.out.printf("Parent Method: %.2f \n", data);
    }
}
