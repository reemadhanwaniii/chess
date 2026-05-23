package models.pieces;

import models.Board.Cell;
import models.helpers.Color;

import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean isKilled;
    private final Color color;
    private final PieceName pieceName;
    private List<Move> movesDone;

    public Piece(Color color,PieceName pieceName) {
        this.color = color;
        this.pieceName = pieceName;
        this.movesDone = new ArrayList<>();
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
}
