package models.pieces;

import models.Board.Cell;
import models.helpers.Color;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(Color color,PieceName pieceName) {
        super(color,pieceName);
    }

    @Override
    public boolean canMove(Cell src, Cell dest) {
        return false;
    }

    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
