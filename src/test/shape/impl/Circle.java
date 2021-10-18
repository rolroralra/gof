package test.shape.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import test.shape.AbstractShape;
import test.shape.Point;

@EqualsAndHashCode(callSuper = true)
@Data
public class Circle<T> extends AbstractShape {
    private Point<T> center;
    private T radius;

    public Circle(Point<T> center, T radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
