package concurrency.simple;

public class Sequencer implements Runnable{

    public void run(){
        for(int i = 0; i < 10; i++){
            System.out.println("thread 1 " + i);
        }
    }
}
