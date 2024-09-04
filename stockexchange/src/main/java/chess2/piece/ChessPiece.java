package chess2.piece;

import chess2.board.ChessBoard;
import chess2.board.ChessCell;
import chess2.move.Move;

public abstract class ChessPiece {
    private final PieceName name;
    private final Color color;
    private boolean isDead;

    public ChessPiece(PieceName name, Color color){
        this.name = name;
        this.color = color;
        this.isDead = false;
    }

    public PieceName getName(){
        return this.name;
    }

    public Color getColor(){
        return this.color;
    }

    public void setIsDead(boolean isDead){
        this.isDead = isDead;
    }

    public boolean getIsDead(){
        return this.isDead;
    }

    public abstract boolean isMovePossible(Move move);

//    public void move(ChessCell src, ChessCell dest, ChessBoard board);
}
