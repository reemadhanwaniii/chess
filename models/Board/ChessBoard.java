package models.Board;

import models.pieces.ChessPiece;
import models.pieces.Move;

import java.util.ArrayList;
import java.util.List;

public class ChessBoard implements Board{

    private static final int rc = 8;
    private static final int cc = 8;
    private final List<List<Cell>> board;


    public ChessBoard() {
        this.board = new ArrayList<>();
        for(int i=0;i<rc;i++) {
           List<Cell> row = new ArrayList<>();
           for(int j=0;j<cc;j++) {
               row.add(new Cell(i,(char)(j+'a')));
           }
           this.board.add(row);
        }
    }
    @Override
    public void display() {
       for(int i=0;i<rc;i++) {
           for(int j=0;j<cc;j++) {
               if(board.get(i).get(j).hasPiece()) {
                   System.out.print(board.get(i).get(j).getPiece().get().getPieceSymbol() + "|");
               }else {
                   System.out.print("___|");
               }
           }
           System.out.println();
       }
    }

    @Override
    public void applyMove(Move move) {
       int srcX = move.getSrcCell().getX();
       char srcY = move.getSrcCell().getY();

       ChessPiece piece = this.board.get(srcX).get(srcY - 'a').getPiece().get();
       piece.makeMove(move.getSrcCell(),move.getDestCell(),this);
    }

    @Override
    public void setPiece(ChessPiece chessPiece, int r, char c) {
        board.get(r).get(c-'a').setPiece(chessPiece);
    }

    public List<List<Cell>> getBoard() {
        return board;
    }
}
