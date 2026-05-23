package game;

import models.Board.Board;
import models.pieces.Move;
import models.players.Player;

import java.util.Queue;

public abstract class BoardGame {
  protected final Board board;
  protected final Queue<Player> players;

  public BoardGame(Board board,Queue<Player> players) {
      this.board = board;
      this.players = players;
  }

  public abstract void showBoard();
  public void startGame() {
//      todo : logic to start game
    while (true) {
      Player current = players.poll();
      Move move = current.makeMove();
      this.board.applyMove(move);
      if (isGameOver()) {
        System.out.println("Game Over");
        System.out.println(current.getName() + " wins");
        break;
      }
      players.add(current);
    }
  }

  protected abstract boolean isGameOver();
}
