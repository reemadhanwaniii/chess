package models.pieces.strategy;

import models.Board.Cell;

public class PawnDiagonalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end) {
        return false;
    }
}
