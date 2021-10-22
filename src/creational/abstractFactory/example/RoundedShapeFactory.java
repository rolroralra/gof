package creational.abstractFactory.example;

import creational.abstractFactory.example.model.RoundedRectangle;
import creational.abstractFactory.example.model.RoundedSquare;
import creational.abstractFactory.example.model.Shape;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String square) {
        switch (square) {
            case "RECTANGLE":
                return new RoundedRectangle();
            case "SQUARE":
                return new RoundedSquare();
        }

        return null;
    }
}
