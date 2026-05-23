package models.players;

import models.Board.Board;
import models.Board.ChessBoard;
import models.pieces.ChessPiece;
import models.pieces.PieceName;

import java.util.Map;

public abstract class ChessPlayer extends Player {

    private final Map<PieceName,ChessPiece> chessPieces;
    private final ChessBoard board;

    public ChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard board) {
        super(name);
        this.chessPieces = chessPieces;
        this.board = board;
    }

    public Map<PieceName, ChessPiece> getChessPieces() {
        return chessPieces;
    }

    public ChessBoard getBoard() {
        return board;
    }
    public ChessPiece getPiece(PieceName pieceName) {
        if(chessPieces.containsKey(pieceName) && chessPieces.get(pieceName).isKilled())
            chessPieces.remove(pieceName);
        if(!chessPieces.containsKey(pieceName))
            throw new IllegalArgumentException("Invalid piece name");

        return chessPieces.get(pieceName);
    }
}
