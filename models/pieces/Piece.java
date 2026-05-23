package models.pieces;

import models.helpers.Color;

public abstract class Piece {
    private boolean isKilled;
    private final Color color;
    private final PieceName pieceName;

    public Piece(Color color,PieceName pieceName) {
        this.color = color;
        this.pieceName = pieceName;
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
}
