package model;

import model.Deck;
import model.PlayingCard;
import model.Rank;
import model.Suit;

import java.util.ArrayList;

public class TestDeck extends Deck {

    public TestDeck() {
        setDeck(new ArrayList<>());
        for(int i = 0; i < 20; i++){
            getDeck().add(new PlayingCard(Rank.ACE,Suit.CLUBS));
        }
    }
}
