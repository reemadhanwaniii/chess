import game.BoardGame;
import game.ChessGame;
import models.Board.Board;
import models.Board.ChessBoard;

public class ChessMain {
    static void main() {
        BoardGame game = new ChessGame(new ChessBoard());
        game.showBoard();
    }
}
