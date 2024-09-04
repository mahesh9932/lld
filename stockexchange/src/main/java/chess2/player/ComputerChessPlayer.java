package chess2.player;

import chess2.board.Board;
import chess2.board.ChessBoard;
import chess2.move.Move;
import chess2.piece.ChessPiece;
import chess2.piece.PieceName;

import java.util.Map;
import java.util.Scanner;

public class ComputerChessPlayer extends ChessPlayer{

    private ComputerChessPlayer(ChessBoard board, String name, Map<PieceName, ChessPiece> pieces){
        super(board, name, pieces);
    }

    @Override
    public Move makeMove() {
    return null;
    }
}
