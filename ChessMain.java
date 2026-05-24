import game.BoardGame;
import game.ChessGame;
import models.Board.Board;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.players.ChessPlayer;
import models.players.Player;
import models.players.PlayerFactory;

public class ChessMain {
    static void main() throws Exception {
        ChessBoard b = new ChessBoard();
        ChessPlayer p1 = (ChessPlayer) PlayerFactory.createPlayer("Alice", Color.WHITE,b);
        ChessPlayer p2 = (ChessPlayer) PlayerFactory.createPlayer("Bob",Color.BLACK,b);

        BoardGame game = new ChessGame(b,p1,p2);
        game.startGame();
    }
}
