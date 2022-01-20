package org.example;

import java.util.Arrays;

public class Podcast extends Track{
    String [] guest;

    public Podcast(float length, String name, String extension, String[] guest) {
        super(length, name, extension);
        this.guest = guest;
    }
    public void printGuest() {
        System.out.println(Arrays.deepToString(guest));
    }

}
