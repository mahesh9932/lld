package designpatterns.numstore.tester;

import designpatterns.numstore.NumStore;
import designpatterns.numstore.inserter.OrderedInserter;
import designpatterns.numstore.searcher.BinarySearcher;

public class NumStoreTester {
    public static void main(String[] args) {
        NumStore numStore = new NumStore(new OrderedInserter(), new BinarySearcher());
        numStore.insert(0);
        numStore.insert(10);
        numStore.insert(1);
        numStore.insert(2);

        System.out.println(numStore.search(1));
    }
}
