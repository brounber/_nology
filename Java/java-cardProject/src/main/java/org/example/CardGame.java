package org.example;

public class CardGame {
    final String[] suits = { "Hearts", "Diamonds", "Spades", "Clubs" };
    final String[] symbol  = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10","J", "Q", "K"};


    final int noOfCardSuits = 13;
    int value;



    public int getFaceValue() {
        return value % noOfCardSuits;
    }

    public int getSuit() {
        return value / noOfCardSuits;
    }

    public String toString() {
        return symbol[getFaceValue()] + " of " + suits[getSuit()];
    }

    public void createDeck() {
        // multidimentional array return card
        for ()
    }



}

