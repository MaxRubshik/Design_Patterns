package src.EnumerationTask;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("one");
        arrayList.add("two");
        System.out.println(arrayList);
        Enumeration enumeration = new IteratorMy(arrayList.iterator());
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
