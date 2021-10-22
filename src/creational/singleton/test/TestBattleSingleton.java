package creational.singleton.test;

import creational.singleton.SingleObject;
import org.junit.jupiter.api.Test;

public class TestBattleSingleton {
    @Test
    public void test_Singleton_Pattern() {
        SingleObject singleObject = SingleObject.getInstance();

        System.out.println(singleObject == SingleObject.getInstance());
        System.out.println(singleObject);
        System.out.println(SingleObject.getInstance());

        // Compile Error
//        SingleObject anotherObject = new SingleObject();
    }

}
