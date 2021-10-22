package creational.abstractFactory.example.model;

public class RoundedSquare extends Square {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
