package creational.abstractFactory.impl;

import creational.abstractFactory.AbstractFactory;
import creational.factory.vo.*;
import lombok.Getter;

public class ColorFactoryImpl extends AbstractFactory {
    private enum ColorType {
        RED(Red.class),
        GREEN(Green.class),
        BLUE(Blue.class);

        @Getter
        private final Class<?> clazz;

        private ColorType(Class<?> clazz) {
            this.clazz = clazz;
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        for (ColorType type: ColorType.values()) {
            if (type.getClazz().getSimpleName().equalsIgnoreCase(colorType)) {
                try {
                    return (Color) type.getClazz().newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        return null;
    }
}
