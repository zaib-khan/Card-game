package model;

import java.util.ArrayList;

public class Hand {
    private ArrayList<PlayingCard> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void addCard(PlayingCard card){
        cards.add(card);
    }
    public PlayingCard getCard(int index){
        return cards.get(index);
    }
    public PlayingCard removeCard(){
        return cards.remove(0);
    }
}
