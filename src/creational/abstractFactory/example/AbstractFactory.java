package creational.abstractFactory.example;

import creational.abstractFactory.example.model.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String square);
}
