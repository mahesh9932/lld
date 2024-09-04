package chess2.player;


import chess2.move.Move;

public abstract class Player {
    private final String name;

    public Player(String name){
        this.name = name;
    }

    public abstract Move makeMove();

    public String getName(){
        return this.name;
    }
}
