package view;

import controller.GameController;

public interface GameViewable {
    void setController(GameController gc);
    void promptForPlayerName();
    void promptForFlip();
    void promptForNewGame();
    void showPlayerName(int num, String playerName);
    void showFaceDownCardForPlayer(int num,String playerName);
    void showCardForPlayer(int num, String playerName, String rank, String suit);
    void showWinner(String playerName);

}
