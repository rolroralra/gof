package structural.filter.impl;

import structural.filter.Filter;

import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class FilterImpl<T> implements Filter<T> {
    Predicate<T> predicate;

    @Deprecated
    @SuppressWarnings("rawtypes")
    public static Filter defaultFilter() {
        return new FilterImpl(t -> true);
    }

    public FilterImpl() {
        predicate = t -> true;
    }

    public FilterImpl(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    @Override
    public Iterable<T> filter(Iterable<T> iterable) {
        Stream<T> stream = StreamSupport.stream(iterable.spliterator(), false).filter(predicate);

        return stream::iterator;
    }
}
