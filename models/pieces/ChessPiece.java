package models.pieces;

import models.Board.Cell;

public interface ChessPiece {
   boolean canMove(Cell src, Cell dest);
   void makeMove(Cell src, Cell dest);
   boolean isKilled();
   void setKilled(boolean killed);
   void listPossibleMoves(Cell src);
}
