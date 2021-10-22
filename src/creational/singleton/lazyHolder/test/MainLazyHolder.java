package creational.singleton.lazyHolder.test;

import creational.singleton.lazyHolder.SingleTonWithLazyHolder;
import org.junit.jupiter.api.Test;

public class MainLazyHolder {
    @Test
    public void test_Singleton_LazyHolder_Pattern() {
        SingleTonWithLazyHolder singleTonWithLazyHolder = SingleTonWithLazyHolder.getInstance();
        System.out.println(singleTonWithLazyHolder == SingleTonWithLazyHolder.getInstance());
        System.out.println(singleTonWithLazyHolder);
        System.out.println(SingleTonWithLazyHolder.getInstance());

//        SingleTonWithLazyHolder another = new SingleTonWithLazyHolder();  // Compile Error

    }
}
