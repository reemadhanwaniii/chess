import game.BoardGame;
import game.GameFactory;


public class ChessMain {
    static void main() throws Exception {

        BoardGame game = GameFactory.createChessGame();
        game.startGame();
    }
}
