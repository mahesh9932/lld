package chess2;

import chess2.board.Board;
import chess2.move.Move;
import chess2.player.Player;

import java.util.Queue;

public abstract class BoardGame {
    private final Board board;
    private final Queue<Player> players;

    public BoardGame(Board board, Queue<Player> players){
        this.board = board;
        this.players = players;
    }

    public void startGame(){
        while(true){
            Player currentPlayer = players.poll();
            Move move = currentPlayer.makeMove();
            board.applyMove(move);
            if(isOver()){
                System.out.println("Game ended.. " + currentPlayer.getName() + " won..");
                return;
            }
            players.add(currentPlayer);
        }
    }

    public abstract boolean isOver();
}
