package designpatterns.iterator.data;



import designpatterns.iterator.Iterable;
import designpatterns.iterator.Iterator;
import designpatterns.iterator.LinkedListIterator;

import java.util.Arrays;
import java.util.List;

public class LinkedList implements Iterable {
    private LinkedListNode head;

    public LinkedList(LinkedListNode head) {
        this.head = head;
    }

    public void insert(LinkedListNode node) {
        LinkedListNode previous = head;
        while (previous.getNext() != null)
            previous = previous.getNext();
        previous.setNext(node);
    }

    @Override
    public Iterator iter() {
        return new LinkedListIterator(this.head);
    }
}