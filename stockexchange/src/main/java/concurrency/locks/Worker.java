package concurrency.locks;

public class Worker implements Runnable {

    private NumStore numStore;
    public Worker(NumStore numStore){
        this.numStore = numStore;
    }

    public void run(){
        for(int i = 0; i < 1000000; i++){
            numStore.increment();
        }
    }
}
