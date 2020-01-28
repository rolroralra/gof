package structual.bridge.test;

import structual.bridge.AbstractShape;
import structual.bridge.Shape;
import structual.bridge.impl.*;

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
