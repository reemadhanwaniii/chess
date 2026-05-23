package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public interface MovementStrategy {
    boolean canMove(Cell start, Cell end, ChessBoard board);
}
