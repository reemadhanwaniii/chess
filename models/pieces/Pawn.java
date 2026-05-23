package models.pieces;

import exceptions.InvalidPieceMoveException;
import models.Board.Cell;
import models.helpers.Color;
import models.helpers.Direction;

public class Pawn extends Piece implements ChessPiece{

    public Pawn(Color color,PieceName pieceName) {
        super(color,pieceName);
    }

    /**
     * direction can be either vertical or diagonal
     * if diagoonal then x == y if y == 1 means move us valid
     */

    @Override
    public boolean canMove(Cell src, Cell dest) {
        Direction direction = getDirection(src,dest);
        int distY = Math.abs(src.getVerticalDist(dest));
        if(isDirectionValid(direction)) {
            if(isMovingVertically(src,dest) && !dest.hasPiece()) {


                if(isFirstMove() && distY == 2) {
//                    todo : logic to move piece and check path is empty
                    return true;
                }else if(distY == 1) {
                    return true;
                }else{
                    return false;
                }
            }else {
                if(dest.hasPiece() && dest.getPiece().get().getColor() != this.getColor() && distY == 1) {
                    return true;
                }
            }
        }
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
