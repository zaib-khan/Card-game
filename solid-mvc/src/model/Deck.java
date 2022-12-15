package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public abstract class Deck {
    private ArrayList<PlayingCard> cards;

    public void shufle(){
        Random random = new Random();
        for (int i = 0;i < cards.size();i++){
            Collections.swap(cards,i,random.nextInt(cards.size()));
        }
    }
    public PlayingCard removeTopCard(){
        return cards.remove(0);
    }
    public void returnCardToDeck(PlayingCard pc){
        cards.add(pc);
    }

    public void setDeck(ArrayList<PlayingCard> cards){
        this.cards = cards;
    }
    public ArrayList<PlayingCard> getDeck(){
        return cards;
    }











}
