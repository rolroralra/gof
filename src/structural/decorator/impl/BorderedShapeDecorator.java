package structural.decorator.impl;

import creational.factory.vo.Shape;
import structural.decorator.ShapeDecorator;

public class BorderedShapeDecorator extends ShapeDecorator {
    public BorderedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        this.setBorder();
    }

    public void setBorder() {
        System.out.println(this.decoratedShape.getClass().getSimpleName() + " is set border!");
    }
}
