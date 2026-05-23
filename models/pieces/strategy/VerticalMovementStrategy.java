package models.pieces.strategy;

import models.Board.Cell;

public class VerticalMovementStrategy implements MovementStrategy{


    @Override
    public boolean canMove(Cell start, Cell end) {
        int distY = Math.abs(start.getVerticalDist(end));
        int distX = Math.abs(start.getHorizontalDist(end));
        return distX == 0 && distY > 0;
    }
}
