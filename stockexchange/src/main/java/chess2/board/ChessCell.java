package chess2.board;


import chess2.piece.ChessPiece;

import java.util.Optional;

public class ChessCell {
    private final int x;
    private final int y;

    private Optional<ChessPiece> chessPiece;

    public ChessCell(int x, int y){
        this.x = x;
        this.y = y;
        chessPiece = Optional.empty();
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public Optional<ChessPiece> getChessPiece(){
        return this.chessPiece;
    }

    public void setChessPiece(Optional<ChessPiece> chessPiece){
        this.chessPiece = chessPiece;
    }


}
