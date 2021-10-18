package test.shape.impl;

import lombok.Data;
import lombok.EqualsAndHashCode;
import test.shape.AbstractShape;
import test.shape.Point;

@EqualsAndHashCode(callSuper = true)
@Data
public class Rectangle<T> extends AbstractShape {
    public static int TOTAL_VERTEX_NUMBER = 4;

    private Point<T> leftBottomPoint;
    private Point<T> rightBottomPoint;
    private Point<T> rightTopPoint;
    private Point<T> leftTopPoint;

    public Rectangle(Point<T> leftBottomPoint, Point<T> rightBottomPoint, Point<T> rightTopPoint, Point<T> leftTopPoint) {
        this.leftBottomPoint = leftBottomPoint;
        this.rightBottomPoint = rightBottomPoint;
        this.rightTopPoint = rightTopPoint;
        this.leftTopPoint = leftTopPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "leftBottomPoint=" + leftBottomPoint +
                ", rightBottomPoint=" + rightBottomPoint +
                ", rightTopPoint=" + rightTopPoint +
                ", leftTopPoint=" + leftTopPoint +
                '}';
    }
}
