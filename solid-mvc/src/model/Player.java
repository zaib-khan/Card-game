package model;

public class Player {
    private String name;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }
    public void addcardToHand(PlayingCard pc){
        hand.addCard(pc);
    }
    public PlayingCard getcard(int index){
        return hand.getCard(index);
    }
    public PlayingCard removeCard(){
        return hand.removeCard();
    }
}
