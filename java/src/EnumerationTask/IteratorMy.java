package src.EnumerationTask;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorMy implements Enumeration {
    Iterator iterator;

    public IteratorMy(Iterator iterator) {
        this.iterator = iterator;
    }

    public IteratorMy() {

    }

    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
