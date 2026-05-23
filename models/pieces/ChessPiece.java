package models.pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.helpers.Color;

public interface ChessPiece {
   boolean canMove(Cell src, Cell dest) throws InvalidPieceMoveException;
   void makeMove(Cell src, Cell dest);
   boolean isKilled();
   void setKilled(boolean killed);
   void listPossibleMoves(Cell src);
   boolean isFirstMove();
   Color getColor();
}
