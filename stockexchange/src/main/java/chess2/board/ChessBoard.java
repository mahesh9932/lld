package chess2.board;
import chess2.move.Move;
import chess2.move.Pair;
import chess2.piece.ChessPiece;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ChessBoard implements Board{
    private final List<List<ChessCell>> cells;
    private final static  int rowCount = 8;
    private final static int colCount = 8;

    public ChessBoard(){
        this.cells = new ArrayList();
        for(int i =0; i < rowCount; i++){
            List<ChessCell> chessCells = new ArrayList<>();
            for(int j = 0; j < colCount; j++){
                chessCells.add(new ChessCell(i, j));
            }
            this.cells.add(chessCells);
        }
        init();
    }

    @Override
    public void applyMove(Move move) {
        Pair src = move.getSrc();
        Pair dest = move.getDest();
        ChessCell  srcCell = getCell(src.getX(), src.getY());
        ChessCell destCell = getCell(dest.getX(), dest.getX());
        ChessPiece chessPiece = srcCell.getChessPiece().get();
        if(chessPiece.isMovePossible(move)){
            Optional<ChessPiece> destChessPiece = this.cells.get(dest.getX()).get(dest.getY()).getChessPiece();
            if(destChessPiece.isPresent()){
                if(destChessPiece.get().getColor().equals(chessPiece.getColor())){
                    throw new RuntimeException("Invalid move");
                }
                destChessPiece.get().setIsDead(true);
            }
            // moving the src piece to dest piece
            srcCell.setChessPiece(Optional.empty());
            destCell.setChessPiece(srcCell.getChessPiece());
        }
    }

    @Override
    public void display() {

    }

    private void init(){
        // intializing the chess Board
    }

    public ChessCell getCell(int x, int y){
        return this.cells.get(x).get(y);
    }
}
