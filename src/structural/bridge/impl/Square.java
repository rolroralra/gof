package structural.bridge.impl;

import lombok.Getter;
import structural.bridge.AbstractShape;
import structural.bridge.DrawAPI;

public class Square extends AbstractShape {
    @Getter
    private final int length;

    public Square(int length, DrawAPI drawAPI) {
        super(drawAPI);
        this.length = length;
    }

    @Override
    public void draw() {
        drawAPI.drawSquare(this.length);
    }
}
