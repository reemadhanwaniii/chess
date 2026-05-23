package game;

import models.helpers.Color;
import models.pieces.ChessPiece;
import models.pieces.Pawn;
import models.pieces.PieceName;

import java.util.HashMap;
import java.util.Map;

public class BoardFactory {
    public static Map<PieceName, ChessPiece> getPieces(Color color) {
        Map<PieceName,ChessPiece> mp = new HashMap<>();
        mp.put(PieceName.PAWN1,new Pawn(color,PieceName.PAWN1));
        mp.put(PieceName.PAWN2,new Pawn(color,PieceName.PAWN2));
        mp.put(PieceName.PAWN3,new Pawn(color,PieceName.PAWN3));
        mp.put(PieceName.PAWN4,new Pawn(color,PieceName.PAWN4));
        mp.put(PieceName.PAWN5,new Pawn(color,PieceName.PAWN5));
        mp.put(PieceName.PAWN6,new Pawn(color,PieceName.PAWN6));
        mp.put(PieceName.PAWN7,new Pawn(color,PieceName.PAWN7));
        mp.put(PieceName.PAWN8,new Pawn(color,PieceName.PAWN8));
        return mp;
    }
}
