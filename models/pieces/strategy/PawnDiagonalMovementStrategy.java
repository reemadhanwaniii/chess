package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;

public class PawnDiagonalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
//        same cell
        if(start.getY() == end.getY() && start.getX() == end.getX()) return false;

        int startRow = start.getX();
        int endRow = end.getX();

        int startCol = start.getY() - 'a';
        int endCol = end.getY() - 'a';

        if(Math.abs(startRow-endRow) != 1 || Math.abs(startCol - endCol) != 1) return false;

        Color color = start.getPiece().get().getColor();

        if(color == Color.WHITE) {

            if(endRow != startRow + 1) {
                return false;
            }

        } else {

            if(endRow != startRow - 1) {
                return false;
            }
        }
        if(!end.hasPiece()) return false;

        return end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
