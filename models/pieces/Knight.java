package models.pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.pieces.strategy.KnightMovementStrategy;

import java.util.Arrays;

public class Knight extends Piece implements ChessPiece {

    public Knight(Color color, PieceName pieceName,String pieceSymbol) {

        super(color,pieceName,pieceSymbol);
        this.movementStrategies = Arrays.asList(new KnightMovementStrategy());
    }


    @Override
    public void makeMove(Cell src, Cell dest, ChessBoard board) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
