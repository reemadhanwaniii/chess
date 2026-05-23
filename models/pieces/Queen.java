package models.pieces;

import models.Board.Cell;
import models.helpers.Color;
import models.pieces.strategy.DiagonalMovementStrategy;
import models.pieces.strategy.HorizontalMovementStrategy;
import models.pieces.strategy.VerticalMovementStrategy;

import java.util.Arrays;

public class Queen extends Piece implements ChessPiece {

    public Queen(Color color, PieceName pieceName,String pieceSymbol) {
        super(color,pieceName,pieceSymbol);
        this.movementStrategies = Arrays.asList(new HorizontalMovementStrategy(),
                                                new VerticalMovementStrategy(),
                                                new DiagonalMovementStrategy());
    }



    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
