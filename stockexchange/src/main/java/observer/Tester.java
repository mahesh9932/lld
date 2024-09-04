package observer;

import observer.publisher.CricketBoardPublisher;
import observer.subscriber.RunRateDisplay;

public class Tester {
    public static void main(String[] args) {
        CricketBoardPublisher cricketBoardPublisher = new CricketBoardPublisher();
        RunRateDisplay d1 = new RunRateDisplay();
        d1.subscribe(cricketBoardPublisher);
    }
}


