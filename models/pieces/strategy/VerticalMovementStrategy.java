package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class VerticalMovementStrategy implements MovementStrategy{


    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        if(start.getX() == end.getX() && start.getY() == end.getY()) return false;

        if(start.getY() != end.getY()) return false;

        int rowStep = (end.getX() > start.getX()) ? 1 : -1;
        int currRow = start.getX() + rowStep;

        int col = start.getY()-'a';

        while(currRow != end.getX()) {
            if(board.getBoard().get(currRow).get(col).hasPiece()) return false;

            currRow+=rowStep;
        }

        return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
