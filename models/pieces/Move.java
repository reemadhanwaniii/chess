package models.pieces;

import models.Board.Cell;

public class Move {
    private final Cell srcCell;
    private final Cell destCell;

    public Move(Cell srcCell,Cell destCell) {
        this.destCell = destCell;
        this.srcCell = srcCell;
    }

    public Cell getSrcCell() {
        return srcCell;
    }

    public Cell getDestCell() {
        return destCell;
    }
}
