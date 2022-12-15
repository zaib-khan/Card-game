package model;

public enum Suit {
    NONE(0),
    DIAMOND(1),
    HEARTS(2),
    SPADES(3),
    CLUBS(4);


    final int suit;
    Suit(int suit) {
        this.suit = suit;
    }
    public int value(){
        return suit;
    }



}
