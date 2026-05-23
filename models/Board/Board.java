package models.Board;

import models.pieces.ChessPiece;
import models.pieces.Move;

public interface Board {
   void display();
   void applyMove(Move move);
   void setPiece(ChessPiece chessPiece,int r,char c);
}
