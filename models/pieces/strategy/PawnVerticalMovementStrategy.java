package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class PawnVerticalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
//        todo : implement pawn movement strategy, also check if path is empty
        return false;
    }
}
