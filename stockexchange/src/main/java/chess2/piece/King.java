package chess2.piece;

import chess2.move.Move;

public class King extends ChessPiece{

    public King(Color color){
        super(PieceName.KING, color);
    }


    @Override
    public boolean isMovePossible(Move move) {
        return false;
    }
}
