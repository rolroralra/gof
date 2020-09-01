package structural.facade.impl;

import creational.factory.vo.Circle;
import creational.factory.vo.Rectangle;
import creational.factory.vo.Shape;
import creational.factory.vo.Square;
import structural.facade.ShapeFacade;

public class ShapeFacadeImpl implements ShapeFacade {
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeFacadeImpl() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    @Override
    public void drawCircle() {
        circle.draw();
    }

    @Override
    public void drawRectangle() {
        rectangle.draw();
    }

    @Override
    public void drawSquare() {
        square.draw();
    }
}
