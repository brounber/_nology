package org.example;

class Person<T> {
    private T faveThing;

    public Person (T faveThing) {
        this.faveThing=faveThing;
    }

    public void setFaveThing(T faveThing) {
        this.faveThing=faveThing;
    }

    public T getFaveThing() {
        return faveThing;
    }
}
