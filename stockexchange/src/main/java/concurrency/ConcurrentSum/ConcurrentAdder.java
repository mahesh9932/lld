package concurrency.ConcurrentSum;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class ConcurrentAdder {
    private List<Integer> list;
    public static AtomicLong totalSum = new AtomicLong(0);
    public static AtomicInteger cnt = new AtomicInteger(0);

    public ConcurrentAdder(List<Integer> list){
        this.list = list;
    }

    public long add(){
        int size = list.size()/4;
        Thread t1 = new Thread(new Adder(list, 0, size - 1));
        Thread t2 = new Thread(new Adder(list, size, 2 * size - 1));
        Thread t3 = new Thread(new Adder(list, 2 * size, 3 * size - 1));
        Thread t4 = new Thread(new Adder(list, 3 * size, list.size()-1));

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        while(cnt.get() < 4){}

        return totalSum.get();
    }

}
