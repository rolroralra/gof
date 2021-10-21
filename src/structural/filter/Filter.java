package structural.filter;

public interface Filter<T> {
    Iterable<T> filter(Iterable<T> iterable);

    @SuppressWarnings("rawtypes")
    static Filter getDefaultFilter() {
        return iterable -> iterable;
    }
}
