package model;

import model.Deck;
import model.PlayingCard;
import model.Rank;
import model.Suit;

import java.util.ArrayList;

public class NormalDeck extends Deck {

    public NormalDeck() {
        setDeck(new ArrayList<>());
        for(Suit s : Suit.values()){
            for(Rank r : Rank.values()){
                getDeck().add(new PlayingCard(r,s));
            }
        }
    }
}
