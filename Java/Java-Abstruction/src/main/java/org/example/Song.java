package org.example;

public class Song extends Track{
    String artist;

    public Song(float length, String extension, String name, String artist ) {
        super(length, extension, name);
        this.artist = artist;
    }
}
