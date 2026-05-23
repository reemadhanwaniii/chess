package models.pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;

public class Knight extends Piece implements ChessPiece {

    public Knight(Color color, PieceName pieceName,String pieceSymbol) {
        super(color,pieceName,pieceSymbol);
    }


    @Override
    public void makeMove(Cell src, Cell dest, ChessBoard board) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
