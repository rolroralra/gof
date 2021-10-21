package creational.prototype.test;

import creational.prototype.Circle;
import creational.prototype.ShapeCache;
import org.junit.jupiter.api.Test;

public class MainPrototype {
    @Test
    public void test_Prototype_Pattern() {
        System.out.println("Shape: " + ShapeCache.getShape(1).getType());
        System.out.println("Shape: " + ShapeCache.getShape(2).getType());
        System.out.println("Shape: " + ShapeCache.getShape(3).getType());

        System.out.println(new Circle());
    }
}
