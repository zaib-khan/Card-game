package model;

public enum DeckType {

    NORMAL(52),
    SMALL(32),
    TEST(0);


    final int nbOfCards;
    DeckType(int nbOfCards){
        this.nbOfCards = nbOfCards;
    }
    public int getValue(){
        return nbOfCards;
    }



}
