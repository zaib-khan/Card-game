package games;

import model.Player;
import model.PlayingCard;

import java.util.List;

public class HighGameEvaluator implements GameEvaluator {
    public Player eveluatingWinner(List<Player> players){
        Player bestPlayer = null;
        int bestRank = -1;
        int bestSuit = -1;

        for (Player player : players){
            boolean newBestPlayer = false;

            if (bestPlayer == null){
                newBestPlayer = true;
            }else{


                PlayingCard pc = player.getcard(0);
                int thisRank = pc.getRank().value();
                if(thisRank >= bestRank){
                    if (thisRank > bestRank){
                        newBestPlayer = true;
                    }else{
                        if (pc.getSuit().value() > bestSuit){
                            newBestPlayer = true;
                        }
                    }
                }
            }
            if (newBestPlayer){
                bestPlayer = player;
                PlayingCard pc = player.getcard(0);
                bestRank = pc.getRank().value();
                bestSuit = pc.getSuit().value();
            }
        }
        return bestPlayer;
    }
}
