package structural.decorator.test;

import creational.factory.vo.Circle;
import creational.factory.vo.Rectangle;
import creational.factory.vo.Shape;
import creational.factory.vo.Square;
import org.junit.jupiter.api.Test;
import structural.decorator.impl.BorderedShapeDecorator;

public class DecoratorTest {
    @Test
    public void test_Decorator_Pattern() {

        /* Original Interface Call */
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();

        circle.draw();
        rectangle.draw();
        square.draw();

        /* Decorator Call (Wrapper) */
        Shape decoratedCircle = new BorderedShapeDecorator(circle);
        decoratedCircle.draw();

        Shape decoratedRectangle = new BorderedShapeDecorator(rectangle);
        decoratedRectangle.draw();

        Shape decoratedSquare = new BorderedShapeDecorator(square);
        decoratedSquare.draw();
    }
}
