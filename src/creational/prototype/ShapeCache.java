package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    private static Map<Integer, Shape> cacheMap = new HashMap<>();

    static {
        ShapeCache.loadCache();
    }

    public static Shape getShape(int id) {
        return cacheMap.get(id);
    }

    public static void saveCache(Shape shape) {
        cacheMap.put(shape.getId(), shape);
    }

    private static void loadCache() {
        Shape circle = new Circle();
        circle.setId(1);

        ShapeCache.saveCache(circle);


        Shape square = new Square();
        square.setId(2);

        ShapeCache.saveCache(square);

        Shape rectangle = new Rectangle();
        rectangle.setId(3);

        ShapeCache.saveCache(rectangle);
    }

}
