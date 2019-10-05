package creational.prototype;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println(this.getType() + "::draw() method called!");
    }
}
