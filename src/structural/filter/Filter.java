package structural.filter;

import java.util.function.Predicate;

public interface Filter<T> {
    Iterable<T> filter(Iterable<T> iterable);
}
