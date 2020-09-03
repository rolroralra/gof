package structural.flyweight.test;

import creational.factory.vo.Shape;
import structural.flyweight.ShapeFactory;

public class MainFlyWeight {
    public static void main(String[] args) {
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
