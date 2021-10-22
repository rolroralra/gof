package creational.abstractFactory.example;

import creational.abstractFactory.example.model.Rectangle;
import creational.abstractFactory.example.model.Shape;
import creational.abstractFactory.example.model.Square;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String square) {
        switch (square) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
        }

        return null;
    }
}
