package org.example;

public class MyChildClass extends MyParentClass {
    float data;

    public MyChildClass(float data) {
        super(data);
    }

    public void childMethod() {
        System.out.printf("Child method: %.2f \n", data);
    }
}
