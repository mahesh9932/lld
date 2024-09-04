package concurrency.ConcurrentSum;

import java.util.List;

public class Adder implements Runnable{

    private List<Integer> myList;
    private int st;
    private int end;

    public Adder(List<Integer> myList, int st, int end){
        this.myList = myList;
        this.st = st;
        this.end = end;
    }

    public void run(){
        long s = 0;
        for(int i = st; i <= end; i++){
            s += myList.get(i);
        }
        ConcurrentAdder.totalSum.addAndGet(s);
        ConcurrentAdder.cnt.incrementAndGet();
    }

}
