package concurrency.ConcurrentSum;

import java.util.List;

public class SeqAdder {

   private List<Integer> list;

   public SeqAdder(List<Integer> list){
       this.list = list;
   }

    public long add(){
        long s = 0;
        for(int i = 0; i < list.size(); i++){
            s += list.get(i);
        }
        return s;
    }
}
