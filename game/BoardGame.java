package game;

import models.Board.Board;

public abstract class BoardGame {
  protected final Board board;

  public BoardGame(Board board) {
      this.board = board;
  }

  public abstract void showBoard();
  public void startGame() {
//      todo : logic to start game
  }

  protected abstract boolean isGameOver();
}
