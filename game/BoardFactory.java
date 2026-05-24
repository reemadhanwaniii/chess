package game;

import models.Board.Cell;
import models.Board.ChessBoard;
import models.helpers.Color;
import models.pieces.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardFactory {
    public static Map<PieceName,ChessPiece> whitePieces;
    public static Map<PieceName,ChessPiece> blackPieces;

    public static Map<PieceName,ChessPiece> getWhitePieces() {
        whitePieces = getPieces(Color.WHITE);
        return whitePieces;
    }
    public static Map<PieceName,ChessPiece> getBlackPieces(){
        blackPieces = getPieces(Color.BLACK);
        return blackPieces;
    }
    public static void prepareBoardByPlacingPieces(ChessBoard board) {


        if(whitePieces == null || blackPieces == null) {
            throw new IllegalStateException("Empty pieces");
        }
        placePawns(board,whitePieces,Color.WHITE);
        placePawns(board,blackPieces,Color.BLACK);

        placeQueen(board,whitePieces,Color.WHITE);
        placeQueen(board,blackPieces,Color.BLACK);

        placeKing(board,whitePieces,Color.WHITE);
        placeKing(board,blackPieces, Color.BLACK);

        placeKnights(board,whitePieces,Color.WHITE);
        placeKnights(board,blackPieces,Color.BLACK);

        placeRooks(board,whitePieces,Color.WHITE);
        placeRooks(board,blackPieces,Color.BLACK);

        placeBishops(board,whitePieces,Color.WHITE);
        placeBishops(board,blackPieces,Color.BLACK);

    }

    private static void placeKing(ChessBoard board,Map<PieceName,ChessPiece> chessPieceMap,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(chessPieceMap.get(PieceName.KING),row,'e');
    }
    private static void placeQueen(ChessBoard board,Map<PieceName,ChessPiece> chessPieces,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(chessPieces.get(PieceName.QUEEN),row,'d');
    }

    private static void placeKnights(ChessBoard board,Map<PieceName,ChessPiece> chessPieceMap,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(chessPieceMap.get(PieceName.KNIGHT1),row,'b');
        board.setPiece(chessPieceMap.get(PieceName.KNIGHT2),row,'g');
    }

    private static void placeRooks(ChessBoard board,Map<PieceName,ChessPiece> chessPieceMap,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(chessPieceMap.get(PieceName.ROOK1),row,'a');
        board.setPiece(chessPieceMap.get(PieceName.ROOK2),row,'h');
    }

    private static void placeBishops(ChessBoard board,Map<PieceName,ChessPiece> chessPieceMap,Color color) {
        int row = (color == Color.WHITE) ? 0 : 7;
        board.setPiece(chessPieceMap.get(PieceName.BISHOP1),row,'c');
        board.setPiece(chessPieceMap.get(PieceName.BISHOP2),row,'f');
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
        mp.put(PieceName.PAWN1,new Pawn(color,PieceName.PAWN1,color.toString().substring(0,1)+"P1"));
        mp.put(PieceName.PAWN2,new Pawn(color,PieceName.PAWN2,color.toString().substring(0,1)+"P2"));
        mp.put(PieceName.PAWN3,new Pawn(color,PieceName.PAWN3,color.toString().substring(0,1)+"P3"));
        mp.put(PieceName.PAWN4,new Pawn(color,PieceName.PAWN4,color.toString().substring(0,1)+"P4"));
        mp.put(PieceName.PAWN5,new Pawn(color,PieceName.PAWN5,color.toString().substring(0,1)+"P5"));
        mp.put(PieceName.PAWN6,new Pawn(color,PieceName.PAWN6,color.toString().substring(0,1)+"P6"));
        mp.put(PieceName.PAWN7,new Pawn(color,PieceName.PAWN7,color.toString().substring(0,1)+"P7"));
        mp.put(PieceName.PAWN8,new Pawn(color,PieceName.PAWN8,color.toString().substring(0,1)+"P8"));
        mp.put(PieceName.ROOK1,new Rook(color,PieceName.ROOK1,color.toString().substring(0,1)+"R1"));
        mp.put(PieceName.ROOK2,new Rook(color,PieceName.ROOK2,color.toString().substring(0,1)+"R2"));
        mp.put(PieceName.BISHOP1,new Bishop(color,PieceName.BISHOP1,color.toString().substring(0,1)+"B1"));
        mp.put(PieceName.BISHOP2,new Bishop(color,PieceName.BISHOP2,color.toString().substring(0,1)+"B2"));
        mp.put(PieceName.KNIGHT1,new Knight(color,PieceName.KNIGHT1,color.toString().toString().substring(0,1)+"K1"));
        mp.put(PieceName.KNIGHT2,new Knight(color,PieceName.KNIGHT2,color.toString().substring(0,1)+"K2"));
        mp.put(PieceName.KING,new King(color,PieceName.KING,color.toString().substring(0,1)+"KG"));
        mp.put(PieceName.QUEEN,new Queen(color,PieceName.QUEEN,color.toString().substring(0,1)+"QN"));
        return mp;
    }
}
