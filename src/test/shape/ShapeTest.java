package test.shape;

import org.junit.jupiter.api.Test;
import test.shape.impl.Circle;
import test.shape.impl.Ellipse;
import test.shape.impl.Line;
import test.shape.impl.Rectangle;

public class ShapeTest {
    @Test
    void test_Shape_Test() {
        Shape circle = new Circle<>(Point.newPoint(1, 2), 1);
        Shape line = new Line<>(Point.newPoint(1,2), Point.newPoint(3, 4));
        Shape rectangle = new Rectangle<>(Point.newPoint(1, 2), Point.newPoint(2, 3), Point.newPoint(3, 4), Point.newPoint(4, 1));

        circle.draw();
        line.draw();
        rectangle.draw();

        circle.resize();
        line.resize();
        rectangle.resize();

        Shape ellipse = new Ellipse<>(1, 2);
        ellipse.draw();
        ellipse.resize(2, 3);
        ellipse.draw();

    }
}
