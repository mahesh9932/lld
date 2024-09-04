package designpatterns.iterator;

import designpatterns.iterator.data.LinkedList;
import designpatterns.iterator.data.LinkedListNode;

public class LinkedListIterator implements Iterator{

    private LinkedListNode head;

    public LinkedListIterator(LinkedListNode head){
        this.head = head;
    }

    @Override
    public boolean hasNext() {
        return this.head != null;
    }

    @Override
    public int get() {
        LinkedListNode currentNode = head;
        this.head = head.getNext();
        return currentNode.getVal();
    }
}
