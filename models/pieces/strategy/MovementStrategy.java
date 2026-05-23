package models.pieces.strategy;

import models.Board.Cell;

public interface MovementStrategy {
    boolean canMove(Cell start, Cell end);
}
