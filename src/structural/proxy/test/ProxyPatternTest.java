package structural.proxy.test;

import org.junit.jupiter.api.Test;
import structural.proxy.Image;
import structural.proxy.ProxyImage;

public class ProxyPatternTest {
    @Test
    public void test_Proxy_Pattern() {
        Image image = new ProxyImage("test.png");
        image.display();
        image.display();
        image.display();

        image = new ProxyImage("test2.png");
        image.display();
        image.display();
    }
}
