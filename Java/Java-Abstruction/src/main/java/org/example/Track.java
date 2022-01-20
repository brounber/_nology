package org.example;

public class Track {
    float length;
    String name;
    String extension;

    public Track(float length, String name, String extension) {
        this.extension = extension;
        this.length= length;
        this.name = name;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    // create a method that gives the file name i.e. name.extension (all lower case)

    public String filename() {
        int len = this.name.length();
        char [] tpmName = new char[len];

        int i = len;
        byte code;
        while (i-- != 0) {
            code = (byte) this.name.charAt(i);
            if (code >= 65 && code < 90) tpmName[i] = (char) (code + 32);
            else if (code == 32) tpmName[i] = '_';
            else tpmName[i] = (char) code;
        }

        return new String(tpmName) + "." + this.extension;

    }

    public void printTrackInfo() {
        System.out.printf("%s.%s - %f", this.name, this.extension, this.length);
    }
}
