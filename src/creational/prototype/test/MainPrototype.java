package creational.prototype.test;

import creational.prototype.Circle;
import creational.prototype.ShapeCache;

public class MainPrototype {
    public static void main(String[] args) {
        System.out.println("Shape: " + ShapeCache.getShape(1).getType());
        System.out.println("Shape: " + ShapeCache.getShape(2).getType());
        System.out.println("Shape: " + ShapeCache.getShape(3).getType());

        System.out.println(new Circle());
    }
}
