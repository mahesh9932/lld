package designpatterns.iterator;

import designpatterns.iterator.data.LinkedList;
import designpatterns.iterator.data.LinkedListNode;
import designpatterns.iterator.data.MyList;

public class IteratorTest {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(new LinkedListNode(1, null));
        ll.insert(new LinkedListNode(2, null));

        MyList ml = new MyList();
        ml.insert(3);
        ml.insert(4);

        display(ll);
        display(ml);
    }

    public static void display(Iterable it){
        Iterator itr = it.iter();
        while(itr.hasNext()){
            System.out.println(itr.get());
        }
        System.out.println();
    }


}
