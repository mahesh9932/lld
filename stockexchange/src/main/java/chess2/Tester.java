package chess2;

import chess2.board.ChessBoard;
import chess2.player.HumanChessPlayer;

import java.util.Map;

public class Tester {
    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        ChessGame chessGame = new ChessGame(board, new HumanChessPlayer(board, "jasbck", null), new HumanChessPlayer(board, "jasbck", null));
        chessGame.startGame();
    }
}
