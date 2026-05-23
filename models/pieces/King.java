package models.pieces;

import models.Board.Cell;
import models.helpers.Color;

public class King extends Piece implements ChessPiece {

    public King(Color color, PieceName pieceName,String pieceSymbol) {
        super(color,pieceName,pieceSymbol);
    }


    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
