package models.pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.helpers.Color;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(Color color,PieceName pieceName) {
        super(color,pieceName);
    }

    @Override
    public boolean canMove(Cell src, Cell dest) {
        if(src.getVerticalDist(dest) > 2) {
            throw new InvalidPieceMoveException("Invalid Move");
        }

        if(!isFirstMove() && src.getVerticalDist(dest) == 2) {
            throw new InvalidPieceMoveException("Invalid Move");
        }

        if(isMovingVertically(src,dest) && dest.hasPiece()) {
            throw new InvalidPieceMoveException("Invalid Move");
        }
        if(isMovingHorizontally(src,dest)) {
            throw new InvalidPieceMoveException("Invalid move");
        }
        return false;
    }

    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
