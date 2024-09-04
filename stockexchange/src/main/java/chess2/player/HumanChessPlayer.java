package chess2.player;

import chess2.board.Board;
import chess2.board.ChessBoard;
import chess2.board.ChessCell;
import chess2.move.Move;
import chess2.move.Pair;
import chess2.piece.ChessPiece;
import chess2.piece.PieceName;

import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class HumanChessPlayer extends ChessPlayer{

    public HumanChessPlayer(ChessBoard board, String name, Map<PieceName, ChessPiece> pieces){
        super(board, name, pieces);
    }

    @Override
    public Move makeMove() {
        this.board.display();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the source");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // validation for x and y

        Optional<ChessPiece> chessPiece = this.board.getCell(x, y).getChessPiece();
        if(chessPiece.isEmpty()){
            throw new IllegalArgumentException("chess piece not found");
        }

        if(!chessPiece.get().equals(this.pieces.get(chessPiece.get().getName()))){
            throw new IllegalArgumentException("chess does not belong to player");
        }
        Pair src = new Pair(x, y);

        System.out.println("enter the destination");

        int destX = scanner.nextInt();
        int destY = scanner.nextInt();

        Pair dest = new Pair(destX, destY);

        return new Move(src, dest);
    }
}
