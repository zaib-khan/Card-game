package view;

import controller.GameController;

import java.util.Scanner;

public class CommendLineView implements GameViewable {

    GameController controller;
    Scanner keyboard = new Scanner(System.in);

    public void setController(GameController gc){
        this.controller = gc;
    };
    public void promptForPlayerName(){
        String name = keyboard.nextLine();
        if (name.isEmpty()){
            controller.startGame();
        }else{
            controller.addPlayer(name);
        }
    };
    public void promptForFlip(){
        System.out.println("Press enter to flip ");
        keyboard.nextLine();
        controller.flipCards();
    };
    public void promptForNewGame(){
        System.out.println("Press enter to restart a game");
        keyboard.nextLine();
        controller.startGame();
    };
    public void showPlayerName(int num, String playerName){
        System.out.println("[" + num + "][" + playerName + "]");
    };
    public void showFaceDownCardForPlayer(int num,String playerName){
        System.out.println("[" + num + "][" + playerName + "]");
    };
    public void showCardForPlayer(int num, String playerName, String rank, String suit){
        System.out.println("[" + num + "][" + playerName + "][" + rank + "][" + suit + "]");
        controller.evaluateWinner();
    };
    public void showWinner(String playerName){
        System.out.println("[" + playerName + "]");
    };
}
