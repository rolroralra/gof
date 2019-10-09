package structual.bridge.impl;

import lombok.Getter;
import structual.bridge.DrawAPI;
import structual.bridge.AbstractShape;

public class Circle extends AbstractShape {
    @Getter
    private final int x;
    @Getter
    private final int y;
    @Getter
    private final int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(this.x, this.y, this.radius);
    }
}
