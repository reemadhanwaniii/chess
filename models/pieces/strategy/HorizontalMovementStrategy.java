package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class HorizontalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        int distX = Math.abs(start.getHorizontalDist(end));
        int distY = Math.abs(start.getVerticalDist(end));

        return distX > 0 && distY == 0;
    }
}
