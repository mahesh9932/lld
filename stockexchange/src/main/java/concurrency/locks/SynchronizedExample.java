package concurrency.locks;

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        NumStore numStore = new NumStore();
        Thread t1 = new Thread(new Worker(numStore));
        Thread t2 = new Thread(new Worker(numStore));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("total is " + numStore.getX());
    }
}
