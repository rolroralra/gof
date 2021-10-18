package test.shape;


public abstract class AbstractShape implements Shape {
    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public void resize(Object... args) {
        System.out.printf("%s is resized...\n", this.getClass().getSimpleName());
    }
}
