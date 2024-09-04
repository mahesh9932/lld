package observer.publisher;

import observer.subscriber.CricketSubscriber;
import observer.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class CricketBoardPublisher extends AbstractPublisher implements CricketPublisher {

    private float overs;
    private int score;
    private int wickets;

    public float getOvers() {
        return overs;
    }

    public int getScore() {
        return score;
    }

    public int getWickets() {
        return wickets;
    }

    public void update(int overs, int score, int wickets) {
        for(Subscriber subscriber: subscribers){

        }
    }

}
