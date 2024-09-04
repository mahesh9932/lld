package concurrency.simple;

public class ReverseSequencer implements Runnable{

    public void run(){
        for(int i = 9; i >= 0; i--){
            System.out.println("thread 2 " + i);
        }
    }
}
