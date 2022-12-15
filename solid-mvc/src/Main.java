import controller.GameController;
import games.DeckFactory;
import games.HighGameEvaluator;
import model.Deck;
import model.DeckType;
import view.CommendLineView;
import view.GameSwing;

public class Main {
    public static void main(String[] args) {

        GameController gameController = new GameController(new GameSwing(), DeckFactory.makeDeck(DeckType.NORMAL),new HighGameEvaluator());
        gameController.run();
    }
}