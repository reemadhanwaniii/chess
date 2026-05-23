package models.Board;

import models.helpers.Pair;
import models.pieces.ChessPiece;

import java.util.Optional;

public class Cell {
   private final Pair position;
   private Optional<ChessPiece> piece;

   public Cell(int x,char y) {
       this.position = new Pair(x,y);
       this.piece = Optional.empty();
   }

    public Pair getPosition() {
        return position;
    }

    public Optional<ChessPiece> getPiece() {
        return piece;
    }

    public void setPiece(ChessPiece piece) {
        this.piece = Optional.of(piece);
    }

    public void removePiece() {
       this.piece = Optional.empty();
    }

    public int getX() {
       return this.position.getX();
    }

    public char getY() {
       return this.position.getY();
    }

    public boolean hasPiece() {
       return piece.isPresent();
    }

    public int getHorizontalDist(Cell cell) {
       return cell.getX() - this.getX();
    }

    public int getVerticalDist(Cell cell) {
       return cell.getY() - this.getY();
    }
}
