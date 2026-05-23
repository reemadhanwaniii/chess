package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class VerticalMovementStrategy implements MovementStrategy{


    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        int distY = Math.abs(start.getVerticalDist(end));
        int distX = Math.abs(start.getHorizontalDist(end));
        return distX == 0 && distY > 0;
    }
}
