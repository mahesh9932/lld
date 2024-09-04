package chess2.board;

import chess2.move.Move;

public interface Board {

    void applyMove(Move move);

    void display();

}
