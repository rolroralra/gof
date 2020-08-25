package creational.abstractFactory.test;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.FactoryProducer;
import creational.abstractFactory.impl.ShapeFactoryImpl;

public class MainAbstractFactory {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = FactoryProducer.getInstance();

        AbstractFactory shapeFactory = factoryProducer.getFactory("Shape");

        shapeFactory.getShape("Circle").draw();
        shapeFactory.getShape("Rectangle").draw();
        shapeFactory.getShape("SQUARE").draw();


        AbstractFactory colorFactory = factoryProducer.getFactory("COLOR");

        colorFactory.getColor("RED").fill();
        colorFactory.getColor("GREEN").fill();
        colorFactory.getColor("Blue").fill();


        AbstractFactory dummyFactory = factoryProducer.getFactory("DUMMY");

        dummyFactory.getShape("Circle").draw();
        dummyFactory.getShape("Rectangle").draw();
        dummyFactory.getShape("SQUARE").draw();

    }
}
