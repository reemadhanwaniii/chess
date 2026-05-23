package game;

import models.Board.ChessBoard;
import models.helpers.Color;
import models.pieces.ChessPiece;
import models.pieces.Pawn;
import models.pieces.PieceName;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardFactory {
    public static void prepareBoardByPlacingPieces(ChessBoard board) {
        Map<PieceName,ChessPiece> whitePieces = getPieces(Color.WHITE);
        Map<PieceName,ChessPiece> blackPieces = getPieces(Color.BLACK);

        placePawns(board,whitePieces,Color.WHITE);
        placePawns(board,blackPieces,Color.BLACK);
    }
    private static void placePawns(ChessBoard board,Map<PieceName,ChessPiece> chessPieces,Color color) {
        int row = (color == Color.BLACK) ? 6 : 1;
        List<PieceName> pieceNameList = Arrays.asList(PieceName.PAWN1,PieceName.PAWN2,PieceName.PAWN3,PieceName.PAWN4,
                                        PieceName.PAWN5,PieceName.PAWN6,PieceName.PAWN7,PieceName.PAWN8);

        for(int i=0;i<8;i++) {
            board.setPiece(chessPieces.get(pieceNameList.get(i)),row,(char)(i+'a'));
        }
    }
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
