package designpatterns.numstore.searcher;

import designpatterns.numstore.Searcher;

import java.util.List;

public class BinarySearcher implements Searcher {
    @Override
    public Integer search(int key, List<Integer> nums) {
        int l = 0;
        int r = nums.size() - 1;

        while (l <= r){
            int mid   = (l + r) / 2;
            if(key < nums.get(mid)){
                r = mid - 1;
            } else if (key > nums.get(mid)) {
                l = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;

    }
}
