package structural.filter;

public interface Filter<T> {
    Iterable<T> filter(Iterable<T> iterable);
}
