package structural.bridge.test;

import structural.bridge.Shape;
import structural.bridge.impl.*;

public class MainBridge {
    public static void main(String[] args) {
        Shape circle = new Circle(2, 3, 4, new GreenDrawAPI());
        circle.draw();

        Shape rectangle = new Rectangle(3,4, new RedDrawAPI());
        rectangle.draw();

        Shape square = new Square(5, new BlueDrawAPI());
        square.draw();
    }
}
