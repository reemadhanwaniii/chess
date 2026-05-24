package game;

import models.Board.ChessBoard;
import models.helpers.Color;
import models.players.ChessPlayer;
import models.players.PlayerFactory;

public class GameFactory {
    public static ChessGame createChessGame() {
        ChessBoard b = new ChessBoard();
        ChessPlayer p1 = (ChessPlayer) PlayerFactory.createPlayer("Alice", Color.WHITE,b);
        ChessPlayer p2 = (ChessPlayer) PlayerFactory.createPlayer("Bob",Color.BLACK,b);

        return new ChessGame(b,p1,p2);
    }
}
