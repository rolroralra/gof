package structural.bridge.example.impl;

import structural.bridge.example.Color;
import structural.bridge.example.Shape;
import test.shape.Drawable;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return String.format("%s Square", this.color.fill());
    }
}
