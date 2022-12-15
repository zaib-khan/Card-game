package games;

import model.Player;

import java.util.List;

public interface GameEvaluator {
    Player eveluatingWinner(List<Player> players);
}
