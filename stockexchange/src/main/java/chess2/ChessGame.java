package chess2;

import chess2.board.ChessBoard;
import chess2.piece.PieceName;
import chess2.player.ChessPlayer;
import chess2.player.Player;
import chess2.board.Board;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ChessGame extends BoardGame{

    private final ChessPlayer player1, player2;

    public ChessGame(ChessBoard chessBoard, ChessPlayer player1, ChessPlayer player2){
        super(chessBoard, new ArrayDeque<Player>(Arrays.asList(player1, player2)));
        this.player1 = player1;
        this.player2 = player2;
    }
    @Override
    public boolean isOver() {
        return player1.getPiece(PieceName.KING).getIsDead() || player2.getPiece(PieceName.KING).getIsDead();
    }
}
