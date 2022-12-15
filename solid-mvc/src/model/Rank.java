package model;

public enum Rank {
    NONE (0),
    TWO (2),
    THREE (3),
    FOUR (2),
    FIVE (2),
    SIX (2),
    SEVEN (2),
    EIGHT (2),
    NINE (2),
    JACK (10),
    QUEEN (11),
    KING (12),
    ACE (13);

    final int rank;

    private Rank(int value){
        rank = value;
    };
    public int value(){
        return rank;
    };

}
