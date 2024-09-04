package observer.publisher;

public interface CricketPublisher extends Publisher {
     float getOvers();
     int getScore();
     int getWickets();
     void update(int overs, int score, int wickets);
}
