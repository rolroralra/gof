package creational.abstractFactory.example.model;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
