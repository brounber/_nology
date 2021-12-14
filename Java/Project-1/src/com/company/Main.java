package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




    byte b = 127;
    short s = 32_767;
    int i = 1234567;
    double d = 99.99;

    System.out.println("1. Produce an integer by dividing your byte by a number input in the terminal\n" +
            "2. Produce a long by multiplying your short by a number input in the terminal\n" +
            "3. Produce a double by dividing your integer by a number input in the terminal\n" +
            "4. Produce a char that is the first character in a string input in the terminal");

    Scanner scan = new Scanner(System.in);


    int divadeb = scan.nextInt();
    System.out.println((int)(b/divadeb));

    long multshort = scan.nextLong();
    System.out.println((long)(s*multshort));

    double divInt = scan.nextDouble();
    System.out.println((double)(i/divInt));


    String convChar = scan.nextLine();
    System.out.println((char)(convChar).charAt(0));





    }

}
