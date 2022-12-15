package controller;

import games.GameEvaluator;
import games.HighGameEvaluator;
import model.Deck;
import model.Player;
import model.PlayingCard;
import view.GameViewable;

import java.util.ArrayList;


public class GameController {
    enum GameState{
        AddingPlayers,
        CardsDealt,
        WinnerRevealed;
    }
    Deck deck;
    ArrayList<Player> players;
    Player winner;
    GameViewable view;
    GameState gameState;
    GameEvaluator gameEvaluator;

    public GameController(GameViewable view, Deck deck, GameEvaluator gameEvaluator){
        this.view = view;
        this.deck = deck;
        players = new ArrayList<Player>();
        gameState = GameState.AddingPlayers;
        this.gameEvaluator = gameEvaluator;
        view.setController(this);
    }

    public void run(){
        while (true){
            switch (gameState){
                case AddingPlayers:
                    view.promptForPlayerName();
                    break;
                case CardsDealt:
                    view.promptForFlip();
                    break;
                case WinnerRevealed:
                    view.promptForNewGame();
                    break;
            }
        }
    }

    public void addPlayer(String playerName){
        if(gameState == GameState.AddingPlayers){
            players.add(new Player(playerName));
            view.showPlayerName(players.size(),playerName);
        }
    }
    public  void startGame(){
        if(gameState != GameState.CardsDealt){
            deck.shufle();
            int playerIndex = 1;
            for (Player player : players){
                player.addcardToHand(deck.removeTopCard());
                view.showFaceDownCardForPlayer(playerIndex++,player.getName());
            }
            gameState = GameState.CardsDealt;
        }
    }

    public void flipCards(){
        int playerIndex = 1;
        for(Player player : players){
            PlayingCard pc = player.getcard(0);
            pc.flip();
            view.showCardForPlayer(playerIndex++,player.getName(),pc.getRank().toString(),pc.getSuit().toString());
        }
    }
    public void evaluateWinner(){
        winner = new HighGameEvaluator().eveluatingWinner(players);
        displayWinner();
    }

    public void displayWinner(){
        view.showWinner(winner.getName());
    }
    public void rebuildDeck(){
        for (Player player : players){
            deck.returnCardToDeck(player.removeCard());
        }
    }

    public void restartGame(){

    }






















}