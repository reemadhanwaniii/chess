package models.pieces;

import models.Board.Cell;
import models.helpers.Color;
import models.pieces.strategy.HorizontalMovementStrategy;
import models.pieces.strategy.VerticalMovementStrategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rook extends Piece implements ChessPiece{

    public Rook(Color color,PieceName pieceName,String pieceSymbol) {
        super(color,pieceName,pieceSymbol);
        this.movementStrategies = Arrays.asList(new VerticalMovementStrategy(),new HorizontalMovementStrategy());
    }



    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }
}
