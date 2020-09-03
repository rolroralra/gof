package structural.flyweight;

import creational.factory.vo.Shape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory extends creational.factory.ShapeFactory {
    Map<String, Shape> cacheMap;

    public ShapeFactory() {
        cacheMap = new HashMap<>();
    }

    @Override
    public Shape getShape(String shapeType) {
        Shape shape = cacheMap.get(shapeType);
        if (shape == null) {
            System.out.println("Cache Saved...");
            shape = super.getShape(shapeType);
            cacheMap.put(shapeType, shape);
        }

        return shape;
    }
}
