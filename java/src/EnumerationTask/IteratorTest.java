package src.EnumerationTask;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("two");
        System.out.println(arrayList);
        IteratorMy iteratorMy = new IteratorMy();
        iteratorMy.hasMoreElements();
        Object o = iteratorMy.nextElement();
        System.out.println(o);
    }
}
