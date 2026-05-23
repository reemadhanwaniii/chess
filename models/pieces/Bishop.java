package models.pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.pieces.strategy.DiagonalMovementStrategy;

import java.util.Arrays;

public class Bishop extends Piece implements ChessPiece {

    public Bishop(Color color,PieceName pieceName,String pieceSymbol) {
        super(color,pieceName,pieceSymbol);
        this.movementStrategies = Arrays.asList(new DiagonalMovementStrategy());
    }




    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
