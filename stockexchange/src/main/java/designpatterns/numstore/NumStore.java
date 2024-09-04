package designpatterns.numstore;

import designpatterns.numstore.inserter.Inserter;

import java.util.ArrayList;
import java.util.List;

public class NumStore {

    private final List<Integer> nums;
    private final Inserter inserter;
    private final Searcher searcher;

    public NumStore(Inserter inserter, Searcher searcher){
        this.inserter = inserter;
        this.searcher = searcher;
        this.nums = new ArrayList<>();
    }

    public void insert(int num){
        this.inserter.insert(num, nums);
    }

    public int search(int key){
       return this.searcher.search(key, nums);
    }

}
