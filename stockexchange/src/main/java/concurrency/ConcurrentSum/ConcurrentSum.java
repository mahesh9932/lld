package concurrency.ConcurrentSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConcurrentSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        Random random = new Random();
        for(int i = 0; i < 10000000; i++){
            list.add(Math.abs(random.nextInt()));
        }
        long stTime = System.currentTimeMillis();
        SeqAdder seqAdder = new SeqAdder(list);
        long result = seqAdder.add();
        System.out.println("total sum by sequential is " + result);
        long endTime = System.currentTimeMillis();
        System.out.println("total time taken is" + (endTime - stTime));

        stTime = System.currentTimeMillis();
        ConcurrentAdder concurrentAdder = new ConcurrentAdder(list);
        result = concurrentAdder.add();
        System.out.println("total sum by concurrent is " + result);
        endTime = System.currentTimeMillis();
        System.out.println("total time taken is" + (endTime - stTime));


        int size = list.size();
        System.out.println(size);

    }
}
