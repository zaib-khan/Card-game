package model;

import model.Deck;
import model.PlayingCard;
import model.Rank;
import model.Suit;

import java.util.ArrayList;

public class SmallDeck extends Deck {

    public SmallDeck() {
        setDeck(new ArrayList<>());
        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                if(r.value() >= 7){
                    getDeck().add(new PlayingCard(r,s));
                }

            }
        }
    }
}
