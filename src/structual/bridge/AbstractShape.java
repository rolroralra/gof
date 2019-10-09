package structual.bridge;

public abstract class AbstractShape implements Shape {
    protected DrawAPI drawAPI;

    protected AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    @Override
    abstract public void draw();
}
