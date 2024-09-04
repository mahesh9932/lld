package chess2.player;

import chess2.board.Board;
import chess2.board.ChessBoard;
import chess2.piece.ChessPiece;
import chess2.piece.PieceName;
import chess2.move.Move;

import java.util.Map;

public abstract class ChessPlayer extends Player{

    public final ChessBoard board;
    public final Map<PieceName, ChessPiece> pieces;


    public ChessPlayer(ChessBoard board, String name, Map<PieceName, ChessPiece> pieces){
        super(name);
        this.board = board;
        this.pieces = pieces;
    }
    @Override
    public abstract Move makeMove();


    public ChessPiece getPiece(PieceName name){
        if(!pieces.containsKey(name))
            throw new IllegalArgumentException("piece name is invalid");
        return this.pieces.get(name);
    }
}
