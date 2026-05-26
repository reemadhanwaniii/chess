package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class KnightMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        if(start.getX() == end.getX() || start.getY() == end.getY()) return false;


        int rowDiff = Math.abs(start.getX() - end.getX());
        int colDiff = Math.abs(start.getY() - end.getY());

        boolean isValid = (rowDiff == 1 && colDiff == 2) || (colDiff == 1 && rowDiff == 2);

        if(!isValid) return false;

        return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
