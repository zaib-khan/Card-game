package games;

import model.*;

public class DeckFactory {


    public static Deck makeDeck(DeckType deckType){
        switch (deckType){
            case NORMAL: return new NormalDeck();
            case SMALL: return new SmallDeck();
            case TEST: return new TestDeck();
        }
        return new NormalDeck();
    }




}
