package creational.lazyHolder;

public class SingleObject {

    private static class LazyHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }

    private SingleObject() { }

    public static SingleObject getInstance() { return LazyHolder.INSTANCE; }
}
