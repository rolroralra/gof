package structual.proxy.test;

import structual.proxy.Image;
import structual.proxy.ProxyImage;

public class MainProxy {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");
        image.display();
        image.display();
        image.display();

        image = new ProxyImage("test2.png");
        image.display();
        image.display();
    }
}
