package creational.singleton.lazyHolder;

public class SingleTonWithLazyHolder {

    private static class LazyHolder {
        private static final SingleTonWithLazyHolder INSTANCE = new SingleTonWithLazyHolder();
    }

    private SingleTonWithLazyHolder() { }

    public static SingleTonWithLazyHolder getInstance() { return LazyHolder.INSTANCE; }
}
