package chess2.move;

public class Move {
    private final Pair src;
    private final Pair dest;

    public  Move(Pair src, Pair dest){
        this.src = src;
        this.dest = dest;
    }

    public Pair getSrc(){
        return this.src;
    }

    public Pair getDest(){
        return this.dest;
    }

}
