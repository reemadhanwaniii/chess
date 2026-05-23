package models.pieces.strategy;

import models.Board.Cell;

public class DiagonalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end) {
        int distX = Math.abs(start.getHorizontalDist(end));
        int distY = Math.abs(start.getVerticalDist(end));
        return distY == distX;
    }
}
