package models.pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.helpers.Color;
import models.helpers.Direction;
import models.pieces.strategy.PawnDiagonalMovementStrategy;
import models.pieces.strategy.PawnVerticalMovementStrategy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(Color color,PieceName pieceName) {
        super(color,pieceName);
        this.movementStrategies = Arrays.asList(new PawnDiagonalMovementStrategy(),new PawnVerticalMovementStrategy());
    }

    /**
     * direction can be either vertical or diagonal
     * if diagoonal then x == y if y == 1 means move us valid
     */

    @Override
    public boolean canMove(Cell src, Cell dest) {
       if(super.canMove(src,dest)) return true;
       return false;
    }

    @Override
    public void makeMove(Cell src, Cell dest) {

    }

    @Override
    public void listPossibleMoves(Cell src) {

    }

    boolean isDirectionValid(Direction direction) {
        if(this.getColor().equals(Color.BLACK)) {
            return direction.equals(Direction.BACKWARD_Y) ||
                    direction.equals(Direction.DIAGONAL_BACKWARD_LEFT) ||
                    direction.equals(Direction.DIAGONAL_BACKWARD_RIGHT);
        }
        return direction.equals(Direction.FORWARD_Y) ||
                direction.equals(Direction.DIAGONAL_FORWARD_RIGHT) ||
                direction.equals(Direction.DIAGONAL_FORWARD_LEFT);
    }
}
