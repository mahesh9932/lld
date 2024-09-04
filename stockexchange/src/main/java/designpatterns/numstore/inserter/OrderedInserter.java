package designpatterns.numstore.inserter;

import designpatterns.numstore.inserter.Inserter;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrderedInserter implements Inserter {

    @Override
    public void insert(Integer num, List<Integer> nums) {
        nums.add(num);
        int k = nums.size() - 1;

        while(k > 0 && nums.get(k - 1) > nums.get(k)){
            Collections.swap(nums, k- 1, k);
        }
    }
}
