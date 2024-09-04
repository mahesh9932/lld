package concurrency.locks;

public class NumStore {
    private int x;
//    private Object lock;

    public NumStore(){
        x = 0;
//        lock = new Object();
    }

    public synchronized void increment(){
//        synchronized (lock){  synchronized(this) block and synchronized function is same acquire the lock on entire object
            x++;
//        }

    }

    public int getX(){
        return x;
    }
}
