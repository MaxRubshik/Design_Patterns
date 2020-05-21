package src.EnumerationTask;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorMy<E> implements Enumeration<E> {
    Iterator iterator;

    public IteratorMy<E>(Iterator iterator) {
        this.iterator = iterator;
    }

    public IteratorMy<E>() {

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
