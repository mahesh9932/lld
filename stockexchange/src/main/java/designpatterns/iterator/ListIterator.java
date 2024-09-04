package designpatterns.iterator;

import java.util.List;

public class ListIterator implements Iterator{

    private final List<Integer> list;
    private int currentIndex;
    public ListIterator(List<Integer> list){
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return this.currentIndex < this.list.size();
    }

    @Override
    public int get() {
        return this.list.get(this.currentIndex++);
    }
}
