package creational.abstractFactory.example.model;

public class RoundedRectangle extends Rectangle {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
