package designpatterns.iterator.data;




import designpatterns.iterator.Iterable;
import designpatterns.iterator.Iterator;
import designpatterns.iterator.ListIterator;

import java.util.ArrayList;
import java.util.List;

public class MyList implements Iterable {
    private final List<Integer> internalList;

    public MyList() {
        this.internalList = new ArrayList<>();
    }

    public void insert(Integer x) {
        this.internalList.add(x);
    }

    @Override
    public Iterator iter() {
        return new ListIterator(this.internalList);
    }
}