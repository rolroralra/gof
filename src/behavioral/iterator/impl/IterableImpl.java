package behavioral.iterator.impl;

import behavioral.iterator.Iterable;
import behavioral.iterator.Iterator;

import java.util.ArrayList;
import java.util.List;

public class IterableImpl<T> implements Iterable<T> {
    private List<T> list;

    public IterableImpl() {
        this(new ArrayList<>());
    }

    public IterableImpl(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorImpl();
    }


    private class IteratorImpl implements Iterator<T> {
        private int index;
        public IteratorImpl() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return this.index >= 0 && this.index < list.size();
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
