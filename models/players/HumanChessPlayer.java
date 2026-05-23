package models.players;

import exceptions.InvalidPieceMoveException;
import models.Board.ChessBoard;
import models.pieces.ChessPiece;
import models.pieces.Move;
import models.pieces.PieceName;

import java.util.Map;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(String name, Map<PieceName, ChessPiece> chessPieces, ChessBoard board) {
        super(name,chessPieces,board);
    }

    @Override
    public Move makeMove() {
//        1. Display current state of board
        this.getBoard().display();

//        Prepare Scanner object to take user input
        System.out.println("Enter src row and col");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        char col = sc.next().charAt(0);

        if(!this.getBoard().getBoard().get(row).get(col-'a').hasPiece()) {
            throw new RuntimeException("No piece found at given row and col");
        }

        System.out.println("Enter dest row and col");
        int destX = sc.nextInt();
        char destY = sc.next().charAt(0);

        ChessPiece pieceToMove = this.getBoard().getBoard().get(row).get(col-'a').getPiece().get();
        if(!pieceToMove.canMove(this.getBoard().getBoard().get(row).get(col-'a'),this.getBoard().getBoard().get(destX).get(destY-'a'),this.getBoard()))
            throw new InvalidPieceMoveException("Invalid Move");
        return new Move(this.getBoard().getBoard().get(row).get(col-'a'),this.getBoard().getBoard().get(destX).get(destY-'a'));
    }
}
