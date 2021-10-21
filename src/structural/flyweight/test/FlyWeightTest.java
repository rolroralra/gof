package structural.flyweight.test;

import creational.factory.vo.Shape;
import org.junit.jupiter.api.Test;
import structural.flyweight.ShapeFactory;

public class FlyWeightTest {
    @Test
    public void test_FlyWeight_Pattern() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("Square").draw();


    }
}
