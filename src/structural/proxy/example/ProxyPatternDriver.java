package structural.proxy.example;

import org.junit.jupiter.api.Test;

public class ProxyPatternDriver {
    @Test
    public void test_Proxy_Pattern_Example() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();

        ExpensiveObject anotherObject = new ExpensiveObjectProxy();
        anotherObject.process();
    }
}
