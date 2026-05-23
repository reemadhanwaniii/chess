package models.pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;

public interface ChessPiece {
   boolean canMove(Cell src, Cell dest, ChessBoard board) throws InvalidPieceMoveException;
   void makeMove(Cell src, Cell dest);
   boolean isKilled();
   void setKilled(boolean killed);
   void listPossibleMoves(Cell src);
   boolean isFirstMove();
   Color getColor();
   String getPieceSymbol();
}
