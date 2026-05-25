package models.pieces.strategy;

import models.Board.Cell;
import models.Board.ChessBoard;

public class DiagonalMovementStrategy implements MovementStrategy{

    @Override
    public boolean canMove(Cell start, Cell end, ChessBoard board) {
//        start and end cannot be same
       if(start.getX() == end.getX() && start.getY() == end.getY()) return false;

       int startRow = start.getX();
       int endRow = end.getX();

       int startCol = start.getY();
       int endCol = end.getY();

       if(Math.abs(startRow-endRow) != Math.abs(startCol - endCol)) return false;

       int rowStep = (startRow > endRow) ? -1 : 1;
       int colStep = (startCol > endCol)?-1:1;

       int currRow = startRow + rowStep;
       int currCol = startCol + colStep;

       while(currRow != endRow && currCol != endCol) {
           if(board.getBoard().get(currRow).get(currCol).hasPiece()) return false;
           currRow+=rowStep;
           currCol+=colStep;
       }

       return !end.hasPiece() || end.getPiece().get().getColor() != start.getPiece().get().getColor();
    }
}
