package models.pieces;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.helpers.Direction;
import models.pieces.strategy.MovementStrategy;


import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean isKilled;
    private final Color color;
    private final PieceName pieceName;
    private final String pieceSymbol;
    private List<Move> movesDone;
    protected List<MovementStrategy> movementStrategies;

    public Piece(Color color,PieceName pieceName,String pieceSymbol) {
        this.color = color;
        this.pieceName = pieceName;
        this.movesDone = new ArrayList<>();
        this.pieceSymbol = pieceSymbol;
    }

    public boolean canMove(Cell start, Cell end, ChessBoard board) {
        return this.movementStrategies.stream().anyMatch(strategy -> strategy.canMove(start,end,board));
    }

    public String getPieceSymbol() {
        return this.pieceSymbol;
    }
    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    public Color getColor() {
        return color;
    }

    public PieceName getPieceName() {
        return pieceName;
    }

    public boolean isFirstMove() {
        return movesDone.isEmpty();
    }


    protected boolean isMovingDiagonally(Cell src, Cell dest) {
        return src.getVerticalDist(dest) == src.getHorizontalDist(dest);
    }

    protected boolean isMovingVertically(Cell src,Cell dest) {
        return src.getVerticalDist(dest) != 0 && src.getHorizontalDist(dest) == 0;
    }

    protected boolean isMovingHorizontally(Cell src,Cell dest) {
        return src.getHorizontalDist(dest) != 0 && src.getVerticalDist(dest) == 0;
    }

    protected Direction getDirection(Cell src,Cell dest) {
        int x = src.getHorizontalDist(dest);
        int y = src.getVerticalDist(dest);

        if(x == 0 && y == 0) {
            return Direction.NONE;
        }
        if(x == 0) {
            return y > 0 ?Direction.FORWARD_Y : Direction.BACKWARD_Y;
        }

        if(y == 0) {
            return x > 0 ?Direction.FORWARD_X : Direction.BACKWARD_X;
        }

        if(x == y) {
            if(x > 0 && y > 0)
                return Direction.DIAGONAL_FORWARD_RIGHT;
            if(x < 0 && y < 0)
                return Direction.DIAGONAL_BACKWARD_RIGHT;
            if(x < 0 && y > 0)
                return Direction.DIAGONAL_FORWARD_LEFT;
            if(x > 0 && y < 0)
                return Direction.DIAGONAL_BACKWARD_LEFT;
        }
        return Direction.NONE;
    }
}
