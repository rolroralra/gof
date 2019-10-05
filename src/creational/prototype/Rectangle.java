package creational.prototype;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println(this.getType() + "::draw() method called!");
    }
}
