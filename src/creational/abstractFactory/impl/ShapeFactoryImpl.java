package creational.abstractFactory.impl;

import creational.abstractFactory.AbstractFactory;
import creational.factory.vo.*;
import lombok.Getter;

public class ShapeFactoryImpl extends AbstractFactory {
    public static enum ShapeType {
        SQUARE(Square.class),
        RECTANGLE(Rectangle.class),
        CIRCLE(Circle.class);

        @Getter
        private final Class<?> clazz;

        private ShapeType(Class<?> clazz) {
            this.clazz = clazz;
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        for (ShapeType type: ShapeType.values()) {
            if (type.getClazz().getSimpleName().equalsIgnoreCase(shapeType)) {
                try {
                    return (Shape) type.getClazz().newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
