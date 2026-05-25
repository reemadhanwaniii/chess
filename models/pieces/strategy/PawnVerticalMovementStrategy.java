package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;

public class PawnVerticalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        if(start.getX() == end.getX() && start.getY() == end.getY()) return false;

        if(start.getY() != end.getY()) return false;

        Color color = start.getPiece().get().getColor();
        int startRow = start.getX();
        int endRow = end.getX();

        int startCol = start.getY() - 'a';

        int direction = (color == Color.WHITE)? 1 : -1;

        if(end.hasPiece()) return false;

//        single step
        if(endRow == startRow + direction) {
            return true;
        }

        if(start.getPiece().get().isFirstMove() &&
            endRow == startRow + (2 * direction)) {

                int intermediateRow =
                        startRow + direction;

                // intermediate square must be empty
                return !board.getBoard()
                        .get(intermediateRow)
                        .get(startCol)
                        .hasPiece();
        }

        return false;
    }
}
