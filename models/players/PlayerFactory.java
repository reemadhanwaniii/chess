package models.players;

import game.BoardFactory;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.pieces.ChessPiece;
import models.pieces.PieceName;

import java.util.Map;

public class PlayerFactory {
    public static Player createPlayer(String name, Color color, ChessBoard board) {
        Map<PieceName, ChessPiece> pieces = (color == Color.WHITE)? BoardFactory.getWhitePieces():
                                                                    BoardFactory.getBlackPieces();

        return new HumanChessPlayer(name,pieces,board);
    }
}
