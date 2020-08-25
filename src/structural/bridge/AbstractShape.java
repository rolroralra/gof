package structural.bridge;

public abstract class AbstractShape implements Shape {
    /* Bridge Pattern
    * Decouple as abstraction from its implementation so that the two can vary independently.
    * */
    protected DrawAPI drawAPI;

    public AbstractShape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    @Override
    abstract public void draw();
}
