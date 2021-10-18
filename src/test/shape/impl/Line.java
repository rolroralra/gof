package test.shape.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import test.shape.AbstractShape;
import test.shape.Point;

@EqualsAndHashCode(callSuper = true)
@Data
public class Line<T> extends AbstractShape {
    private Point<T> startPoint;
    private Point<T> endPoint;

    public Line(Point<T> startPoint, Point<T> endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "Line{" +
                "startPoint=" + startPoint +
                ", endPoint=" + endPoint +
                '}';
    }
}
