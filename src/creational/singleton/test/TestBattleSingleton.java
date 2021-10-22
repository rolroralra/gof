package creational.singleton.test;

import creational.singleton.SingleTon;
import creational.singleton.SingleTonWithSynchronized;
import org.junit.jupiter.api.Test;

public class TestBattleSingleton {
    @Test
    public void test_Singleton_Pattern() {
        SingleTon singleTon = SingleTon.getInstance();

        System.out.println(singleTon == SingleTon.getInstance());
        System.out.println(singleTon);
        System.out.println(SingleTon.getInstance());

        // Compile Error
//        SingleObject anotherObject = new SingleObject();

        SingleTonWithSynchronized singleTonWithSynchronized = SingleTonWithSynchronized.getInstance();
        System.out.println(singleTonWithSynchronized == SingleTonWithSynchronized.getInstance());
        System.out.println(singleTonWithSynchronized);
        System.out.println(SingleTonWithSynchronized.getInstance());
    }

}
