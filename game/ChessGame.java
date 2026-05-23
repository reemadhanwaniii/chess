package game;

import models.Board.Board;
import models.Board.ChessBoard;
import models.pieces.PieceName;
import models.players.ChessPlayer;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ChessGame extends BoardGame{

    private final ChessPlayer player1;
    private final ChessPlayer player2;

    public ChessGame(ChessBoard board,ChessPlayer player1,ChessPlayer player2) {
        super(board,new ArrayDeque<>(Arrays.asList(player1,player2)));
        this.player1 = player1;
        this.player2 = player2;
        BoardFactory.prepareBoardByPlacingPieces(board);
    }

    @Override
    public void showBoard() {
        this.board.display();
    }

    @Override
    protected boolean isGameOver() {
        boolean isWhiteKingDead = player1.getPiece(PieceName.KING).isKilled();
        boolean isBlackKingDead = player2.getPiece(PieceName.KING).isKilled();

        return isBlackKingDead || isWhiteKingDead;
    }

    private void initBoard() {

    }
}
