package designpatterns.numstore.inserter;

import designpatterns.numstore.inserter.Inserter;

import java.util.List;

public class unOrderedInserter implements Inserter {
    @Override
    public void insert(Integer num, List<Integer> nums) {
        nums.add(num);
    }
}
