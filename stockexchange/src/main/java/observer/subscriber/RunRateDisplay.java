package observer.subscriber;

import observer.publisher.CricketPublisher;
import observer.publisher.FootBallPublisher;
import observer.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class RunRateDisplay implements CricketSubscriber, FootBallSubscriber{
    private int score;
    private float overs;

    private List<Publisher> publishers;

    public void update(CricketPublisher publisher) {
        int score = publisher.getScore();
        float overs = publisher.getOvers();
        System.out.println("Cricket Update: Score = " + score + ", Overs = " + overs);
    }

    public void update(FootBallPublisher publisher) {
        int goals = publisher.getGoals();
        float timeout = publisher.getTimeout();
        System.out.println("Football Update: Goals = " + goals + ", Timeout = " + timeout);
    }

    public void subscribe(Publisher publisher) {
        publisher.subscribe(this);
        publishers.add(publisher);
    }

    public void unSubscribe(Publisher publisher) {
        publisher.unSubscribe(this);
        publishers.remove(publisher);
    }
}
