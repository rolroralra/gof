package structural.bridge.example.impl;

import structural.bridge.example.Color;
import structural.bridge.example.Shape;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return String.format("%s Triangle", this.color.fill());
    }
}
