package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class HorizontalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
       if(start.getY() == end.getY() && start.getX() == end.getX()) return false;

       if(start.getX() != end.getX()) return false;

       int colStep = (end.getY() > start.getY()) ? 1 : -1;
       int currCol = start.getY() + colStep;

       int row = start.getX();

       while(currCol != end.getY()) {
           if(board.getBoard().get(row).get(currCol).hasPiece()) return false;

           currCol+=colStep;
       }

       return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
