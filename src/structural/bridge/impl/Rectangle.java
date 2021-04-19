package structural.bridge.impl;

import lombok.Getter;
import structural.bridge.AbstractShape;
import structural.bridge.DrawAPI;

public class Rectangle extends AbstractShape {
    @Getter
    private final int width;
    @Getter
    private final int height;

    public Rectangle(int width, int height, DrawAPI drawAPI) {
        super(drawAPI);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        drawAPI.drawRectangle(this.width, this.height);
    }
}
