package designpatterns.numstore.searcher;

import designpatterns.numstore.Searcher;

import java.util.List;

public class LinearSearcher implements Searcher {
    @Override
    public Integer search(int key, List<Integer> nums) {
        for(int i =0; i < nums.size() - 1; i++){
            if( nums.get(i) == key){
                return i;
            }
        }
        return -1;
    }
}
