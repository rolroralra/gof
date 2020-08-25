package structural.proxy.test;

import structural.proxy.Image;
import structural.proxy.ProxyImage;

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
