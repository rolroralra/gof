package creational.prototype;

public class Square extends Shape {
    @Override
    public void draw() {
        System.out.println(this.getType() + "::draw() method called!");
    }
}
